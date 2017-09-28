package com.parkcharge.repository;

import com.parkcharge.model.ClienteEntity;
import com.parkcharge.model.ServizioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by smatino on 25/08/2017.
 */
public interface ServiziRepository extends CrudRepository<ServizioEntity, Integer> {

    @Query("from ServizioEntity s where s.idCliente.idCliente=:idCliente")
    public List<ServizioEntity> findServiziByIdCliente(@Param("idCliente")Integer idCliente);

    @Query("select s from ServizioEntity s left join PrenotazioneEntity p on p.servizio=s where   s.coordinataX >= :latitude1 and s.coordinataX <= :latitude2 " +
            "and s.coordinataY>= :longitude1 and s.coordinataY <= :longitute2 and ( p.dataInizioServizio NOT BETWEEN :dataDa AND :dataA ) AND ( p.dataFineServizio NOT BETWEEN :dataDa AND :dataA )  ")
    public List<ServizioEntity> findClientByPosition(@Param("latitude1")Double latitude1, @Param("latitude2")Double latitude2,
                                                     @Param("longitude1")Double longitude1, @Param("longitute2")Double longitute2,
                                                     @Param("dataDa") Date dataDa , @Param("dataA") Date dataA );
}
