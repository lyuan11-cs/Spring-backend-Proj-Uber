package demo.model;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Leg {
    private Integer id;
    private Point startPosition;
    private Point endPosition;
    private Double length;
    private Double heading;
}