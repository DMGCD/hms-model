package com.hotel.model_service.controller.impl;

import com.hotel.model_service.controller.CommonController;
import com.hotel.model_service.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RequiredArgsConstructor
public class CommonControllerImpl<T, ID, S extends CommonService<T, ID>> implements CommonController<T, ID> {
    protected final S service;

    @Override
    public ResponseEntity<T> add(T t) throws Exception {
        return new ResponseEntity<>(service.add(t), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<T>> getAll() throws Exception {
        return new ResponseEntity<List<T>>(service.getAllDetails(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> findById(ID id) throws Exception {
        return new ResponseEntity<T>(service.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> update(T t, ID id) throws Exception {
        return new ResponseEntity<T>(service.updateDetails(t, id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> delete(ID id) throws Exception {
        return new ResponseEntity<String>(service.deleteDetails(id), HttpStatus.OK);
    }
}
