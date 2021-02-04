package com.array.basic;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getAverage() {

        List<Double> grades = new ArrayList<>();
        grades.add(6.5);
        grades.add(4.5);
        grades.add(6.5);
        grades.add(9.5);

        Student sc = new Student(grades);

        assertEquals(27,sc.getAverage(),0.05);
    }
}