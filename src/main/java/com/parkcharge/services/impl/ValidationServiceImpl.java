package com.parkcharge.services.impl;


import com.parkcharge.exception.CustomValidator;
import com.parkcharge.exception.ValidationException;
import com.parkcharge.services.ValidationService;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 21.09.15.
 */
@Service
public class ValidationServiceImpl implements ValidationService {

    public void validateModel(Object model, final String... profiles) throws ValidationException {
        Validator validator = new CustomValidator();

        if (profiles != null && profiles.length > 0) {
            for (String profile : profiles) {
                validator.disableProfile(profile);
            }
        }

        List<ConstraintViolation> constraintViolationList = validator.validate(model);

        Map<String, String> errors = new HashMap<String, String>();

        if (constraintViolationList.size() > 0) {
            for (ConstraintViolation constraintViolation : constraintViolationList) {
                errors.put(constraintViolation.getCheckName(), constraintViolation.getMessage());
            }
            throw new ValidationException(errors.toString());
        }

        if (profiles != null && profiles.length > 0) {
            for (String profile : profiles) {
                validator.enableProfile(profile);
            }
        }
    }

}
