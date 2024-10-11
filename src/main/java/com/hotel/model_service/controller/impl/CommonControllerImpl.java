package com.hotel.model_service.controller.impl;

import com.hotel.model_service.controller.CommonController;
import com.hotel.model_service.service.CommonService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommonControllerImpl<T,ID,S extends CommonService<T,ID>> implements CommonController<T,ID> {
    protected final S service;
}
