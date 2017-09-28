package com.parkcharge.contoller;

import com.parkcharge.dto.ClienteDTO;
import com.parkcharge.dto.FeedbackDTO;
import com.parkcharge.dto.LoginDTO;
import com.parkcharge.dto.SearchDTO;
import com.parkcharge.exception.ApplicationException;
import com.parkcharge.exception.RestWebServiceException;
import com.parkcharge.model.ClienteEntity;
import com.parkcharge.model.FeedbackEntity;
import com.parkcharge.model.ServizioEntity;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smatino on 23/08/2017.
 */
@Controller
@RequestMapping("users")
@Api(value="users", description="Endpoint for user management")
public class UserController extends BaseController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private ClienteEntity loginService(@RequestBody LoginDTO loginDTO) throws ApplicationException {
        logger.info(loginDTO.toString());
        try {
            validationService.validateModel(loginDTO);
            return clientiService.login(loginDTO);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }


    @RequestMapping(value = "/searchByPosition", method = RequestMethod.POST)
    @ResponseBody
    private List<ServizioEntity> searchByPosition(@RequestBody SearchDTO searchDTO) throws ApplicationException {
        logger.info(searchDTO.toString());
        try {
            validationService.validateModel(searchDTO);
            return clientiService.getClientiServiceByPosition(searchDTO);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }



    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    private void newClient(@RequestBody ClienteDTO clienteDTO) throws ApplicationException {
        logger.info(clienteDTO.toString());
        try {
            validationService.validateModel(clienteDTO);
            clientiService.createNewClient(clienteDTO);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }


    @RequestMapping(value = "/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    private List<ServizioEntity> getClient(@PathVariable String idCliente) throws ApplicationException {
        logger.info(idCliente.toString());
        try {
            validationService.validateModel(idCliente);
            return clientiService.getCliente((idCliente));
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }


    @RequestMapping(value = "/feedback/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    private List<FeedbackEntity> getFeedback(@PathVariable String idCliente) throws ApplicationException {
        logger.info(idCliente.toString());
        try {
            validationService.validateModel(idCliente);
            return clientiService.getFeedback((idCliente));
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }


    @RequestMapping(value = "/feedback", method = RequestMethod.PUT)
    @ResponseBody
    private FeedbackEntity insertFeedback(@RequestBody FeedbackDTO feedbackDTO) throws ApplicationException {
        logger.info(feedbackDTO.toString());
        try {
            validationService.validateModel(feedbackDTO);
            return clientiService.saveFeedback(feedbackDTO);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }
}
