package demo.model;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DirectionInput {

    private String from;
    private String to;

}
