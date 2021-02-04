package com.array.basic;

import java.util.List;

public class Student {

    List <Double> studentsGrades;

    public Student(List<Double> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    public double getAverage(){
        double average = 0.0;

        for (double d : studentsGrades){

            average += d;
        }
        return  average;
    }


}
