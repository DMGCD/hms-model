package com.hotel.model_service.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.model_service.repository.CommonRepository;
import com.hotel.model_service.service.CommonService;
import jakarta.ws.rs.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonServiceImpl<T, ID, R extends CommonRepository<T, ID>> implements CommonService<T, ID> {
    protected R repository;

    @Override
    public T add(T t) {
        return repository.save(t);
    }

    @Override
    public List<T> getAllDetails() {
        return repository.findAll();
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not Found User For This ID "));
    }

    @Override
    public T updateDetails(T t, ID id) throws JsonProcessingException {
        T t1 = repository.findById(id).orElseThrow(() -> new NotFoundException("Not Found This User For This ID"));
        T updatedObject = new ObjectMapper().readerForUpdating(t1).readValue(new ObjectMapper().writeValueAsString(t));
        return repository.saveAndFlush(updatedObject);
    }

    @Override
    public String deleteDetails(ID id) {
        T t = repository.findById(id).orElseThrow(() -> new NotFoundException("Not Found This User For This ID"));
        repository.delete(t);
        return "successFull Delete ";
    }
}
