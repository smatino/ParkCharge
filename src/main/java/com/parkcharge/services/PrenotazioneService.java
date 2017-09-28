package com.parkcharge.services;

import com.parkcharge.dto.PrenotazioneDTO;
import com.parkcharge.model.PrenotazioneEntity;

import java.util.List;

/**
 * Created by smatino on 29/08/2017.
 */
public interface PrenotazioneService {

    List<PrenotazioneEntity> getPrenotazione(String idCliente);

    void insertReservation(PrenotazioneDTO prenotazioneDTO);
}
