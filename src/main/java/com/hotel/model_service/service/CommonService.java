package com.hotel.model_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CommonService<T, ID> {


    T saveDetails(T t);

    List<T> getAllDetails();

    T findDetailsById(ID id);

    T updateDetails(T t, ID id) throws JsonProcessingException;

    String deleteDetails(ID id);
}
