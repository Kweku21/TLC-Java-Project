package com.array.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    List<Student> studentList = new ArrayList<>();
    List<Double> studentAverageGrades = new ArrayList<>();

    public void enter(Student student){

        studentList.add(student);
        studentAverageGrades.add(student.getAverage());
    }


    public double getHighestAverageGrade(){

        Collections.sort(studentAverageGrades,Collections.reverseOrder());
        return studentAverageGrades.get(0);

    }


}
