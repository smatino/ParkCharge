package com.parkcharge.contoller;

import com.parkcharge.services.ClientiService;
import com.parkcharge.services.PrenotazioneService;
import com.parkcharge.services.TipoServizioService;
import com.parkcharge.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by smatino on 24/08/2017.
 */
public abstract class BaseController {


    @Autowired
    protected ValidationService validationService;

    @Autowired
    protected TipoServizioService tipoServizioService;

    @Autowired
    protected ClientiService clientiService;

    @Autowired
    protected PrenotazioneService prenotazioneService;


}
