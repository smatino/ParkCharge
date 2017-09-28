package com.parkcharge.contoller;

import com.parkcharge.exception.ApplicationException;
import com.parkcharge.exception.RestWebServiceException;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by smatino on 24/08/2017.
 */
@Controller
@RequestMapping("services")
@Api(value="services", description="Endpoint for user management")
public class ServicesController extends BaseController{

    private org.slf4j.Logger logger = LoggerFactory.getLogger(ServicesController.class);

    @RequestMapping(value = "/{idCliente}", method = RequestMethod.GET)
    @ResponseBody
    private void getServicesByClient(@PathVariable String idCliente) throws ApplicationException {
        logger.info(idCliente.toString());
        try {
            validationService.validateModel(idCliente);
            // return nuevoSpedizioneRestAdapterService.addSpedizioneWebService(listSpedizioneWebServiceWrapper);
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }

}
