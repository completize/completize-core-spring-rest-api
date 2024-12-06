package com.completize.core.spring.rest.api.infrastructure.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Component
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Adapter {

    @AliasFor(annotation = Component.class)
    String value() default "";

}
