package com.parkcharge.services.impl;

import com.parkcharge.dto.*;
import com.parkcharge.model.*;
import com.parkcharge.repository.*;
import com.parkcharge.services.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by smatino on 24/08/2017.
 */
@Service
public class ClientiServiceImpl implements ClientiService {

    @Autowired
    private ClientiRepository clientRepository;


    @Autowired
    private ServiziRepository serviziRepository;

    @Autowired
    private TipoServizioRepository tipoServizioRepository;

    @Autowired
    private TipoPresaRepository tipoPresaRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Autowired
    private TipoParcheggioRepository tipoParcheggioRepository;


    @Override
    public List<ServizioEntity> getCliente(String idCliente) {
        List<ServizioEntity> servizioEntityList = serviziRepository.findServiziByIdCliente(new Integer(idCliente));

        return servizioEntityList;

    }

    @Override
    public List<FeedbackEntity> getFeedback(String idCliente) {
        List<FeedbackEntity> feedbackEntityList = feedbackRepository.findFeedbackByIdCliente(new Integer(idCliente));

        return feedbackEntityList;
    }

    @Override
    public FeedbackEntity saveFeedback(FeedbackDTO feedbackDTO) {

        FeedbackEntity feedbackEntity = new FeedbackEntity();

        ClienteEntity clienteEntity = clientRepository.findOne(new Integer(feedbackDTO.getIdCliente()));
        ServizioEntity servizioEntity = serviziRepository.findOne(new Integer(feedbackDTO.getIdServizio()));

        feedbackEntity.setServizio(servizioEntity);
        feedbackEntity.setCliente(clienteEntity);
        feedbackEntity.setValutazione(feedbackDTO.getValutazione());
        feedbackEntity.setDescrizione(feedbackDTO.getDescrizione());

        return feedbackRepository.save(feedbackEntity);

    }

    @Override
    public void createNewClient(ClienteDTO clienteDTO) {

        ClienteEntity clienteEntity = new ClienteEntity();
        ServizioEntity servizioEntity = null;
        DisponibilitaEntity disponibilitaEntity = null;
        MesiEntity mesiEntity = null;
        GiorniEntity giorniEntity= null;
        FasceOrarieEntity fasceOrarieEntity = null;

        clienteEntity.setCf(clienteDTO.getCf());
        clienteEntity.setCognome(clienteDTO.getCognome());
        clienteEntity.setEmail(clienteDTO.getEmail());
        clienteEntity.setNome(clienteDTO.getNome());
        clienteEntity.setPassword(clienteDTO.getPassword());
        clienteEntity.setTipoCliente(tipoClienteRepository.findOne(clienteDTO.getIdTipoCliente()));


        for(ServizioDTO s : clienteDTO.getServizio()){
            servizioEntity = new ServizioEntity();
            servizioEntity.setCoordinataX(s.getCoordinataX());
            servizioEntity.setCoordinataY(s.getCoordinataY());
            servizioEntity.setCosto(s.getCosto());
            servizioEntity.setFineServizio(s.getFineServizio());
            servizioEntity.setInizioServizio(s.getInizioServizio());
            servizioEntity.setIdTipoServizio(tipoServizioRepository.findOne(s.getTipoServizio()));
            servizioEntity.setIdTipoPresa(tipoPresaRepository.findOne(s.getTipoPresa()));
            servizioEntity.setTipoParcheggio(tipoParcheggioRepository.findOne(s.getIdTipoParcheggio()));
            servizioEntity.setIdCliente(clienteEntity);

            DisponibilitaDTO disponibilitaDTO = s.getDisponibilita();
            giorniEntity = disponibilitaDTO.getDays();
            mesiEntity = disponibilitaDTO.getMonths();
            fasceOrarieEntity = disponibilitaDTO.getFasceOrarie();
            disponibilitaEntity = new DisponibilitaEntity();
            disponibilitaEntity.setFasceOrarieEntity(fasceOrarieEntity);
            disponibilitaEntity.setGiorniEntity(giorniEntity);
            disponibilitaEntity.setMesiEntity(mesiEntity);

            servizioEntity.setDisponibilita(disponibilitaEntity);


        }




        serviziRepository.save(servizioEntity);

    }

    @Override
    public ClienteEntity login(LoginDTO loginDTO) {

       ClienteEntity result =  clientRepository.login(loginDTO.getEmail(), loginDTO.getPassword());

        return result;
    }

    @Override
    public List<ServizioEntity> getClientiServiceByPosition(SearchDTO searchDTO) {

        List<ServizioEntity> servizioEntityList = null;

        //range dinamico di ricerca in base alla distanza del centro
        servizioEntityList =  serviziRepository.findClientByPosition(searchDTO.getLatitude()-searchDTO.getDistance(),
                searchDTO.getLatitude()+searchDTO.getDistance(), searchDTO.getLongitude()-searchDTO.getDistance(),
                searchDTO.getLongitude()+searchDTO.getDistance() ,searchDTO.getDataDa(), searchDTO.getDataA());

        servizioEntityList = checkAviability(servizioEntityList, searchDTO);

        return servizioEntityList;
    }



    private List<ServizioEntity>  checkAviability(List<ServizioEntity> servizioEntityList, SearchDTO searchDTO){
        List<ServizioEntity> servizioEntityListReturn = new ArrayList<ServizioEntity>();

        long diffTime = searchDTO.getDataDa().getTime() - searchDTO.getDataA().getTime();
        long diffDays = diffTime / (1000 * 60 * 60 * 24);



        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(searchDTO.getDataDa());
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        int hours = cal.get(Calendar.HOUR);

        String mese = DisponibilitaDTO.mesi.get(month+1);
        String giorno = DisponibilitaDTO.giorni.get(day-1);
        String ora = DisponibilitaDTO.ore.get(hours);

        if(servizioEntityList!=null){
            for(ServizioEntity s : servizioEntityList) {
                java.lang.reflect.Method method;
                try {
                    if (diffDays >= 6) {

                        method = s.getDisponibilita().getMesiEntity().getClass().getMethod("is" + mese);
                        Boolean meseRes = (Boolean) method.invoke(s.getDisponibilita().getMesiEntity());

                        if(s.getDisponibilita().allDay() && s.getDisponibilita().allHours() && meseRes){
                            servizioEntityListReturn.add(s);
                        }

                    } else {

                            method = s.getDisponibilita().getMesiEntity().getClass().getMethod("is" + mese);
                            Boolean meseRes = (Boolean) method.invoke(s.getDisponibilita().getMesiEntity());

                            method = s.getDisponibilita().getGiorniEntity().getClass().getMethod("is" + giorno);
                            Boolean giornoRes = (Boolean) method.invoke(s.getDisponibilita().getGiorniEntity());

                            method = s.getDisponibilita().getFasceOrarieEntity().getClass().getMethod("is" + ora);
                            Boolean hoursRes = (Boolean) method.invoke(s.getDisponibilita().getFasceOrarieEntity());

                            if (meseRes && giornoRes && hoursRes) {
                                servizioEntityListReturn.add(s);
                            }


                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return servizioEntityListReturn;
    }
}

