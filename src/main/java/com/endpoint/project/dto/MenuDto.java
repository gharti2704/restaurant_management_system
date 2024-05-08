package com.endpoint.project.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuDto {

    private int id;
    private String name;
    private String description;
    private double price;
}