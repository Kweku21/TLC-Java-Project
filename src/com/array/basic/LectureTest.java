package com.array.basic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void getHighestAverageGrade() {

        List<Double> grades1 = Arrays.asList(2.4,5.3,6.4,3.5);
        List<Double> grades2 = Arrays.asList(2.4,5.3,6.4,3.5);
        List<Double> grades3 = Arrays.asList(2.4,5.3,6.4,3.5);
        List<Double> grades4 = Arrays.asList(2.4,5.3,6.4,3.5);




        Lecture lecture = new Lecture();

        lecture.enter(new Student(grades1));
        lecture.enter(new Student(grades2));
        lecture.enter(new Student(grades3));
        lecture.enter(new Student(grades4));


    }
}