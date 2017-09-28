package com.parkcharge.services.impl;

import com.parkcharge.dto.PrenotazioneDTO;
import com.parkcharge.model.PrenotazioneEntity;
import com.parkcharge.model.ServizioEntity;
import com.parkcharge.repository.ClientiRepository;
import com.parkcharge.repository.PrenotazioniRepository;
import com.parkcharge.repository.ServiziRepository;
import com.parkcharge.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by smatino on 29/08/2017.
 */
@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

    @Autowired
    PrenotazioniRepository prenotazioniRepository;

    @Autowired
    ClientiRepository clientiRepository;

    @Autowired
    ServiziRepository serviziRepository;

    @Override
    public List<PrenotazioneEntity> getPrenotazione(String idCliente) {

       return prenotazioniRepository.getPrenotazione(new Integer(idCliente));
    }

    @Override
    public void insertReservation(PrenotazioneDTO prenotazioneDTO) {

        PrenotazioneEntity prenotazioneEntity = new PrenotazioneEntity();

        ServizioEntity servizioEntity = serviziRepository.findOne(new Integer(prenotazioneDTO.getIdServizio()));

        prenotazioneEntity.setCliente(clientiRepository.findOne(new Integer(prenotazioneDTO.getIdCliente())));
        prenotazioneEntity.setDataInizioServizio(prenotazioneDTO.getDataInizioServizio());
        prenotazioneEntity.setDataFineServizio(prenotazioneDTO.getDataFineServizio());
        prenotazioneEntity.setServizio(servizioEntity);

        //diff in msec
        long diff = prenotazioneDTO.getDataFineServizio().getTime() - prenotazioneDTO.getDataInizioServizio().getTime();

        //diff in days
        long hours = diff / (60 * 60 * 1000);

        //Pagamento su base oraria
        prenotazioneEntity.setDataPrenotazione(new Date());
        prenotazioneEntity.setCostoPrenotazione(servizioEntity.getCosto() * (hours));

        prenotazioniRepository.save(prenotazioneEntity);
    }
}
