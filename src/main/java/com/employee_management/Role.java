package com.employee_management;

public enum Role {
    INTERN("INTERN"),
    MANAGER("MANAGER"),
    PRODUCT_MANAGER("PRODUCT_MANAGER"),
    PROJECT_MANAGER("PROJECT_MANAGER"),
    DEVELOPER("DEVELOPER"),
    SENIOR_DEVELOPER("SENIOR_DEVELOPER");

    private String value;

    public String getResponse() {
        return value;
    }

    Role(String value){
        this.value = value;
    }
}
