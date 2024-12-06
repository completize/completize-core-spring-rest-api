package com.completize.core.spring.rest.api.infrastructure.exceptions;

import jakarta.persistence.PersistenceException;
import lombok.NoArgsConstructor;

import java.io.Serial;

@NoArgsConstructor
public class EntityNotFoundException extends PersistenceException {

    @Serial
    private static final long serialVersionUID = -7549982895110035528L;

    public EntityNotFoundException(Exception cause) { super(cause); }

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Exception cause) {
        super(message, cause);
    }

}
