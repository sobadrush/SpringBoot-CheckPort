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
public class DeptVO implements Serializable {

    private Long deptId;
    private String deptName;
    private String deptLoc;

}
