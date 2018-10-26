package com.lei.spring.uber.domain;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Embeddable
@RequiredArgsConstructor
@Data
public class UnitFault {
    private final String vin;
    private Long spn;
    private Long fmi;

    @SuppressWarnings("unused")
    private UnitFault(){
        this.vin = "";
    }
}
