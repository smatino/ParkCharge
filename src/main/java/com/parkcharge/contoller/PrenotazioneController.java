package com.parkcharge.contoller;

import com.parkcharge.dto.LoginDTO;
import com.parkcharge.dto.PrenotazioneDTO;
import com.parkcharge.exception.ApplicationException;
import com.parkcharge.exception.RestWebServiceException;
import com.parkcharge.model.ClienteEntity;
import com.parkcharge.model.PrenotazioneEntity;
import com.parkcharge.model.ServizioEntity;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smatino on 29/08/2017.
 */
@Controller
@RequestMapping("booking")
@Api(value="booking", description="Endpoint for user management")
public class PrenotazioneController extends BaseController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(PrenotazioneController.class);

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    private void creaPrenotazione(@RequestBody PrenotazioneDTO prenotazioneDTO) throws ApplicationException {
        logger.info(prenotazioneDTO.toString());
        try {
            validationService.validateModel(prenotazioneDTO);
            prenotazioneService.insertReservation(prenotazioneDTO);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }


    @RequestMapping(value = "/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    private List<PrenotazioneEntity> getClient(@PathVariable String idCliente) throws ApplicationException {
        logger.info(idCliente.toString());
        try {
            validationService.validateModel(idCliente);
            return prenotazioneService.getPrenotazione(idCliente);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }
}
