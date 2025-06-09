package com.avajava.avaEliel.enums;

public enum Roles {
    ADMIN ("admin") ,
    USER("user");

    private String roles;

    Roles(String roles) {
        this.roles = roles;
    }


    String getRoles (){
        return roles;
    }
}
