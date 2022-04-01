package com.iteesoft.sta.model;

import com.iteesoft.sta.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class Widget {
        private String name;
        private Role role;
}
