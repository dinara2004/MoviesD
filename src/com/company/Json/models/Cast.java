package com.company.Json.models;

public class Cast {

    private String fullName;
    private String role;

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Cast: " +
                "fullName: " + fullName + "\n" +
                ", role: " + role;
    }
}
