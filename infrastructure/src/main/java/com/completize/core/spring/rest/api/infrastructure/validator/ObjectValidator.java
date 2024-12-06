package com.completize.core.spring.rest.api.infrastructure.validator;

import com.completize.core.rest.api.infrastructure.validator.Validator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public final class ObjectValidator implements Validator<Object> {

    public static final Validator<Object> INSTANCE = new ObjectValidator();

    @Override
    public void validate(Object value) {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            final jakarta.validation.Validator validator = factory.getValidator();
            final Set<ConstraintViolation<Object>> violations = validator.validate(value);
            if (!violations.isEmpty())
                throw new ConstraintViolationException(violations);
        }
    }

}
