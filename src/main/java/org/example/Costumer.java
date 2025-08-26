package org.example;

public class Costumer {

    private String name;
    private boolean isStudent;
    private String email;

    public Costumer(String name, boolean isStudent, String email) {
        this.name = name;
        this.isStudent = isStudent;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public String getEmail() {
        return email;
    }




}
