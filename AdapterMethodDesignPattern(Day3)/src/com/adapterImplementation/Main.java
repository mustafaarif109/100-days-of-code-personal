package com.adapterImplementation;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentClient studentClient = new StudentClient();
        List<Student> result = studentClient.getStudentList();
        System.out.println(result);
    }
}
