package com.adapterImplementation;

public class SchoolStudent implements Student{
    private String name;
    private String surname;
    private String email;

    public SchoolStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
