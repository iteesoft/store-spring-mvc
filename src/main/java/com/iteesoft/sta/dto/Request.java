package com.iteesoft.sta.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Request {

    @NotNull
    private String email;

    @NotNull
    private String password;
}
