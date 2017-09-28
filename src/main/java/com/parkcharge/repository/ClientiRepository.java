package com.parkcharge.repository;

import com.parkcharge.model.ClienteEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by smatino on 24/08/2017.
 */
public interface ClientiRepository extends CrudRepository<ClienteEntity, Integer> {

    @Query("from ClienteEntity c where c.email=:email and c.password=:password")
    public ClienteEntity login(@Param("email")String email,@Param("password") String password);

}
