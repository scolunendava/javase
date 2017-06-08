package com.tutorial.SecondProblem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by dandrunakievich on 6/8/2017.
 */
public class SecondProblemTest {

    private SecondProblem secondProblem;

    @Before
    public void setUp() {
        secondProblem = new SecondProblem();
    }

    @Test
    public void testGetSumFirst() {
        int number = 3456789;
        int expectedResult = 6;

        int actualResult = secondProblem.getSum(number);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetSumSecond() {
        int number = 1234;
        int expectedResult = 1;

        int actualResult = secondProblem.getSum(number);

        assertEquals(expectedResult,actualResult);
    }
}
