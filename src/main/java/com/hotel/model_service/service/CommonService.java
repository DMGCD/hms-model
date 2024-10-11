package com.hotel.model_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CommonService<T, ID> {
    T add(T t);

    List<T> getAllDetails();


    T findById(ID id);

    T updateDetails(T t, ID id) throws JsonProcessingException;

    String deleteDetails(ID id);
}
