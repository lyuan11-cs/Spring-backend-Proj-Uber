package demo.model;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CurrentPosition {

    private String vin;
    private Point location;
    private VehicleStatus vehicleStatus = VehicleStatus.NONE;
    private Double speed;
    private Double heading;
    private FaultCode faultCode;

}