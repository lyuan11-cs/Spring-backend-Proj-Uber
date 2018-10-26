package com.lei.spring.uber.service.impl;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import com.lei.spring.uber.domain.Location;
import com.lei.spring.uber.domain.LocationRepository;
import com.lei.spring.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }
    public List<Location> saveCarLocation(List<Location> carLocations) {
        return locationRepository.save(carLocations);
    }

    public void deleteAll() {
        this.locationRepository.deleteAll();
    }

    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable) {
        //call vehicle registration web service
        //vehicle valid or not
        return this.locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType),pageable);
    }

    public Page<Location> findByVin(String vin, Pageable pageable) {
        return locationRepository.findByUnitInfoUnitVin(vin,pageable);
    }
}
