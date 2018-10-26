package com.lei.spring.uber.domain;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LocationRepository extends JpaRepository<Location,Long> {

            Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType movementType, Pageable pageable);
            Page<Location> findByUnitInfoUnitVin(@Param("unitVin") String unitVin, Pageable pageable);





}
