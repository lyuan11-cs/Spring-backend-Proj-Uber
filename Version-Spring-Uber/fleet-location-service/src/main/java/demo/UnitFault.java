package demo;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
@RequiredArgsConstructor
public class UnitFault {

    private final String vin;
    private Long spn;
    private Long fmi;

    @SuppressWarnings("unused")
    private UnitFault() {
        this.vin = "";
    }

}