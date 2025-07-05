package com.standard_practice.Standard.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ResponseUtil<T> {
    private int status ;
    private Boolean success;
    private String message;
    private T data;
}

