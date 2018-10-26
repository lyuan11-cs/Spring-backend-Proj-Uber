package demo.model;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FaultCode {

    private String engineMake;
    private String faultCode;
    private String faultCodeId;
    private String faultCodeClassification;
    private String description;
    private String repairInstructions;
    private String fmi;
    private String sa;
    private String spn;

}
