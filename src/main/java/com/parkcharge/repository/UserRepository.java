package com.parkcharge.repository;

/**
 * Created by smatino on 01/09/2017.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository {// extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
