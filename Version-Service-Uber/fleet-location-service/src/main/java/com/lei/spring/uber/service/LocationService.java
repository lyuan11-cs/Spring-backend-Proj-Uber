package com.lei.spring.uber.service;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import com.lei.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocationService {

    List<Location> saveCarLocation(List<Location> carLocations);

    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);

    Page<Location> findByVin(String vin, Pageable pageable);
}
