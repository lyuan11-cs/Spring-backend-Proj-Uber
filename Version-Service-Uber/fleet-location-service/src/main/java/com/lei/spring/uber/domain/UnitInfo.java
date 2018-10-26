package com.lei.spring.uber.domain;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Embeddable
public class UnitInfo {

    private final String unitVin; //why is final? after init, the value can not be changed; in order to immutable field
    private String engineMake;
    private String customerName;
    private String unitNumber;


    private UnitInfo(){    //when you write private construcror
        this.unitVin = "";
    }



}
