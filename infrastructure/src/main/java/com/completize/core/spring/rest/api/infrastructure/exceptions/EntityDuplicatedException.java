package com.completize.core.spring.rest.api.infrastructure.exceptions;

import jakarta.persistence.PersistenceException;
import lombok.NoArgsConstructor;

import java.io.Serial;

@NoArgsConstructor
public class EntityDuplicatedException extends PersistenceException {

    @Serial
    private static final long serialVersionUID = -8028129282449683017L;

    public EntityDuplicatedException(Exception cause) { super(cause); }

    public EntityDuplicatedException(String message) {
        super(message);
    }

    public EntityDuplicatedException(String message, Exception cause) {
        super(message, cause);
    }

}
