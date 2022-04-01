package com.iteesoft.sta.enums;

import lombok.Getter;

public enum LeaveType {
    CASUAL("Casual"),
    ANNUAL("Annual"),
    MATERNITY("Maternity"),
    EDUCATION("Education");

    @Getter
    private String displayName;

    LeaveType(String displayName) {
        this.displayName = displayName;
    }
}
