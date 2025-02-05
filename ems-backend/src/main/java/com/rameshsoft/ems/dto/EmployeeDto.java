package com.rameshsoft.ems.dto;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
