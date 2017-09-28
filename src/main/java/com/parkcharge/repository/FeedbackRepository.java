package com.parkcharge.repository;

import com.parkcharge.model.FeedbackEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by smatino on 31/08/2017.
 */
public interface FeedbackRepository extends CrudRepository<FeedbackEntity , Integer> {


    @Query("from FeedbackEntity f where f.servizio.idCliente.idCliente=:idCliente")
    List<FeedbackEntity> findFeedbackByIdCliente(@Param("idCliente") Integer idCliente);


}
