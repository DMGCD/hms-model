package com.hotel.model_service.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hotel.model_service.controller.CommonController;
import com.hotel.model_service.service.CommonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public  class CommonControllerImpl<T, ID, S extends CommonService<T, ID>> implements CommonController<T, ID> {
    protected S service;
    @Override
    public ResponseEntity<T> add(T t)  {
        return new ResponseEntity<T>(service.saveDetails(t), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<T>> getAll()  {
        return new ResponseEntity<List<T>>(service.getAllDetails(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> findById(ID id) {
        return new ResponseEntity<T>(service.findDetailsById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> update(T t, ID id) throws JsonProcessingException {
        return new ResponseEntity<T>(service.updateDetails(t,id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> delete(ID id)  {
        return new ResponseEntity<String>(service.deleteDetails(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getSay() {
        return null;
    }
}
