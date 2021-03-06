package com.iteesoft.sta.enums;

import lombok.Getter;

public enum Role {
    EMPLOYEE("Employee"),
    ADMIN("Admin");

    @Getter
    private String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }
}
