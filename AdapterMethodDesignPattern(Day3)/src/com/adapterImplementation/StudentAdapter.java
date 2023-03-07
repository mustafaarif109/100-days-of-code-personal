package com.adapterImplementation;

public class StudentAdapter implements Student{

    private CollegeStudent collegeStudent;
    public StudentAdapter(CollegeStudent collegeStudent) {
        this.collegeStudent = collegeStudent;
    }

    @Override
    public String getName() {
        return collegeStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return collegeStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return collegeStudent.getEmailAddress();
    }
}
