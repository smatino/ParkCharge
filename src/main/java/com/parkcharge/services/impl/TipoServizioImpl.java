package com.parkcharge.services.impl;

import com.parkcharge.model.TipoServizioEntity;
import com.parkcharge.repository.TipoServizioRepository;
import com.parkcharge.services.TipoServizioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by smatino on 25/08/2017.
 */
@Service
public class TipoServizioImpl implements TipoServizioService {

    @Autowired
    private TipoServizioRepository tipoServizioRepository;

    @Override
    public List<TipoServizioEntity> getTipiServizio() {

        List<TipoServizioEntity> result = new ArrayList<TipoServizioEntity>();

        for (TipoServizioEntity t :  tipoServizioRepository.findAll()){
            result.add(t);
        }

        return result;
    }
}
