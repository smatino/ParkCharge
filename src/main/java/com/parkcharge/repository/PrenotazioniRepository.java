package com.parkcharge.repository;

import com.parkcharge.model.PrenotazioneEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by smatino on 29/08/2017.
 */
public interface PrenotazioniRepository extends CrudRepository<PrenotazioneEntity, Integer> {

    @Query("from PrenotazioneEntity p where p.cliente.idCliente=:idCliente")
    List<PrenotazioneEntity> getPrenotazione(@Param("idCliente")Integer idCliente);
}
