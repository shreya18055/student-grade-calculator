
package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    GradeCalculator calculator = new GradeCalculator();

    @Test
    void testGradeA() {
        assertEquals("A", calculator.calculateGrade(90));
        assertEquals("A", calculator.calculateGrade(100));
    }

    @Test
    void testGradeB() {
        assertEquals("B", calculator.calculateGrade(80));
        assertEquals("B", calculator.calculateGrade(89));
    }

    @Test
    void testGradeC() {
        assertEquals("C", calculator.calculateGrade(70));
        assertEquals("C", calculator.calculateGrade(79));
    }

    @Test
    void testGradeD() {
        assertEquals("D", calculator.calculateGrade(60));
        assertEquals("D", calculator.calculateGrade(69));
    }

    @Test
    void testGradeF() {
        assertEquals("F", calculator.calculateGrade(0));
        assertEquals("F", calculator.calculateGrade(59));
    }

    @Test
    void testPassBoundary() {
        assertFalse(calculator.isPass(39));
        assertTrue(calculator.isPass(40));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
            () -> calculator.calculateGrade(-1));
        assertThrows(IllegalArgumentException.class,
            () -> calculator.calculateGrade(101));
    }

    @Test
    void testInvalidPassMarks() {
        assertThrows(IllegalArgumentException.class,
            () -> calculator.isPass(-1));
        assertThrows(IllegalArgumentException.class,
            () -> calculator.isPass(101));
    }
}
