package com.nanshan.springboothelloworld.model;

import lombok.*;

import java.io.Serializable;

/**
 * @author RogerLo
 * @date 2023/11/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmpVO implements Serializable {

    private Long empId;
    private String empName;
    private int salary;

}
