package com.adapterImplementation;

public class CollegeStudent{
    private String firstName;
    private String lastName;
    private String emailAddress;

    public CollegeStudent(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
