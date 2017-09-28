package com.parkcharge.contoller;

import com.parkcharge.exception.ApplicationException;
import com.parkcharge.exception.RestWebServiceException;
import com.parkcharge.model.ServizioEntity;
import com.parkcharge.model.TipoServizioEntity;
import com.parkcharge.services.TipoServizioService;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by smatino on 25/08/2017.
 */
@Controller
@RequestMapping("serviceType")
@Api(value="serviceType", description="Endpoint for user management")
public class TipoServizioController extends BaseController{

    private org.slf4j.Logger logger = LoggerFactory.getLogger(TipoServizioController.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    private List<TipoServizioEntity> getTipoServizio() throws ApplicationException {
        logger.info("Tipo servizio controller");
        try {
            return tipoServizioService.getTipiServizio();
        } catch (Exception e) {
            throw new RestWebServiceException(e);
        }
    }
}
