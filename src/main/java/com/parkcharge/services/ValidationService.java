package com.parkcharge.services;


import com.parkcharge.exception.ValidationException;

/**
 * Created on 21.09.15.
 */
public interface ValidationService {

    void validateModel(Object model, final String... profiles) throws ValidationException;

}
