package com.array.inherit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void checkNaughty() {

        List<Double> grades = Arrays.asList(2.4,5.3,6.4,3.5);

        NaughtyStudent naughtyStudent = new NaughtyStudent(grades);

        assertEquals(false,naughtyStudent.checkNaughty(10));

    }

    @Test
    void  scoreNaughtyStudent(){


    }
}