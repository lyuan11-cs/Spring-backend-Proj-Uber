package demo.model;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Denotes a point on the globe.
 *
 *
 */
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Point {
    private Double latitude;
    private Double longitude;

    @Override
    public String toString() {
        return "Point [lat/lang:" + latitude + "," + longitude + "]";
    }

}
