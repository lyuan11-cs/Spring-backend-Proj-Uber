package com.lei.spring.uber.domain;/*
 * Created By Lei Yuan on 10/24/18 10 2018
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
@RequiredArgsConstructor
public class FaultCode {
        private String engineMake;
        private String faultCode;
        private String faultCodeId;
        private String faultCodeClassification;
        private String description;
        @Column(length=1024)
        private String repairInstructons;
        private Long fmi;
        private String sa;
        private Long spn;

}
