package com.array.inherit;

import com.array.basic.Student;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> studentsGrades) {
        super(studentsGrades);
    }

    public boolean checkNaughty(double actualAverage){

        double ten_percent = actualAverage * (10/100) ;

        double cheatedValue = ten_percent + actualAverage;

        if (cheatedValue <= getAverage()){

            return false;

        }else{

            return true;

        }
    }


}
