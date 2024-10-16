package com.hotel.model_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommonController<T, ID> {

    ResponseEntity<T> add(T t) ;

    ResponseEntity<List<T>> getAll() ;

    ResponseEntity<T> findById(ID id) ;

    ResponseEntity<T> update(T t, ID id) throws JsonProcessingException;

    ResponseEntity<String> delete(ID id) ;

    ResponseEntity<String> getSay();
}
