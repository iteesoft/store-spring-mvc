package com.iteesoft.ems.model;

import com.iteesoft.ems.enums.Role;
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
