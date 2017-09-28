package com.parkcharge.exception;

import java.util.Map;

/**
 * Created on 14.08.15.
 */
public class ValidationException extends ApplicationException {

    private Map<String, String> errors;

    public ValidationException() {
    }

    public ValidationException(Map<String, String> errors) {
        this.errors = errors;
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidationException(Throwable cause) {
        super(cause);
    }

    public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}
