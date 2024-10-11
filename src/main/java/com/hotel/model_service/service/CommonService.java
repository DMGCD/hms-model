package com.hotel.model_service.service;

import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface CommonService<T, ID> {
    T add(T t);

    List<T> getAllDetails();


    T findById(ID id);

    T updateDetails(T t, ID id);

    String deleteDetails(ID id);
}
