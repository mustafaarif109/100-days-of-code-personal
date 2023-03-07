package com.adapterImplementation;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList(){
        List<Student> lstOfStudents = new ArrayList<>();

        SchoolStudent schoolStudent = new SchoolStudent("Ben","White","ben@gmail.com");

        CollegeStudent collegeStudent = new CollegeStudent("Adam","Frost","adam@gmail.com");

        lstOfStudents.add(schoolStudent);
        StudentAdapter studentAdapter = new StudentAdapter(collegeStudent);
        lstOfStudents.add(studentAdapter);
        return lstOfStudents;
    }
}
