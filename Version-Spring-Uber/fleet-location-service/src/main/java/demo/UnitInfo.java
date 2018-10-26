package demo;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@Embeddable
@RequiredArgsConstructor
public class UnitInfo {

    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;

    @SuppressWarnings("unused")
    private UnitInfo() {
        this.unitVin = "";
    }

}