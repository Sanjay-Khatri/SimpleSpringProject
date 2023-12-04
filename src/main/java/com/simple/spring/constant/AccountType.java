package com.simple.spring.constant;

public enum AccountType {

    SAVING("saving"),
    CURRENT("current"),
    PREMIUM("premium"),
    ;

    private final String value;

    AccountType(String value) {
        this.value = value;
    }
}
