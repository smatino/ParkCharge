package com.parkcharge.exception;

/**
 * Created on 25.08.15.
 */
public class RestWebServiceException extends ServiceException {

    public RestWebServiceException() {
    }

    public RestWebServiceException(String message) {
        super(message);
    }

    public RestWebServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestWebServiceException(Throwable cause) {
        super(cause);
    }

    public RestWebServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
