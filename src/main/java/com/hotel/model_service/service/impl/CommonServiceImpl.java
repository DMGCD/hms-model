package com.hotel.model_service.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.model_service.exception.NotFoundException;
import com.hotel.model_service.repository.CommonRepository;
import com.hotel.model_service.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CommonServiceImpl<T, ID, R extends CommonRepository<T, ID>> implements CommonService<T, ID> {
    protected R repo;

    @Override
    public T saveDetails(T t) {
        return repo.save(t);
    }

    @Override
    public List<T> getAllDetails() {
        List<T> all = repo.findAll();
        if (!all.isEmpty()) return all;
        throw new NotFoundException("Not Found Details Of This ");
    }

    @Override
    public T findDetailsById(ID id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Not Found Details For This ID: " + id));
    }

    @Override
    public T updateDetails(T t, ID id) throws JsonProcessingException {
        T t1 = repo.findById(id).orElseThrow(() -> new NotFoundException("Not Found Details For This ID: " + id));

        T updateEntity = new ObjectMapper().readerForUpdating(t1).readValue(new ObjectMapper().writeValueAsString(t));
        repo.saveAndFlush(updateEntity);

        return updateEntity;
    }

    @Override
    public String deleteDetails(ID id) {
        T t = repo.findById(id).orElseThrow(() -> new NotFoundException("Not Found Details For This ID: " + id));
        return (t != null) ? "Delete SuccessFull!" : "Not Complete Deleted";
    }
}
