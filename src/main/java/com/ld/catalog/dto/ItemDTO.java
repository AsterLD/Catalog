package com.ld.catalog.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ItemDTO {

    @JsonIgnore
    private Long id;

    @JsonProperty("name")
    private String name;


}

