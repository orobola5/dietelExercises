package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentReportTest {
    @Test
    void testThatAStudentReportCanBeCreated(){
        int [][] grades = new int[2][3];
        Semicolon cohort10 = new Semicolon(grades);
        assertNotNull(grades);

    }
    @Test
    void testFoRTheTotalOfStudent() {
        int [][] grades={{100,50,50},{90,90,80}};
        Semicolon cohort10 = new Semicolon(grades);
        int result = cohort10.getSum(0);
        assertEquals(200, result);
        result = cohort10.getSum(1);
        assertEquals(260,result);
    }
    @Test
    void testForTheAverageOfStudent(){
        int [][] grades={{100,50,50},{90,90,80}};
        Semicolon cohort10 = new Semicolon(grades);
        double result = cohort10.getAverage(0);
        assertEquals(66, result);
        result = cohort10.getAverage(1);
        assertEquals(86, result);
    }
    @Test
    void testForTheHighestScore(){
        int [][] grades = {{120,50,50},{200,80,70}};
        Semicolon cohort10 = new Semicolon(grades);
        int maximum = cohort10.getHighestGrade(1);
        assertEquals(200,maximum);
        maximum = cohort10.getHighestGrade(0);
        assertEquals(120,maximum);

    }
    @Test
    void testForTheLowestScore(){
        int [][] grades = {{120,90,50},{200,80,70}};
        Semicolon cohort10 = new Semicolon(grades);
        int minimum = cohort10.getLowestGrade(0);
        assertEquals(50,minimum);
        minimum = cohort10.getLowestGrade(1);
        assertEquals(70,minimum);
    }
}
