package com.hotel.model_service.repository;

import com.hotel.model_service.model.Room;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RoomRepository extends CommonRepository<Room, Integer>{

}
