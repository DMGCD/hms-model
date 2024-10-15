package com.hotel.model_service.utils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RestController
@Documented
@RequestMapping("/api/v1")
public @interface ResApiV1 {
}
