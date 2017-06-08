package com.tutorial.firstproblem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by dandrunakievich on 6/7/2017.
 */
public class FirstProblemTest {

    private FirstProblem firstProblem;

    @Before
    public void setUp() {
        firstProblem = new FirstProblem();
    }

    @Test
    public void testGetStrayNumberFirst() {
        int[] array = {1, 2, 2};
        int expectedResult = 1;

        int actualResult = firstProblem.getStrayNumber(array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetStrayNumberSecond() {
        int[] array = {2, 1, 2};
        int expectedResult = 1;

        int actualResult = firstProblem.getStrayNumber(array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetStrayNumberLast() {
        int[] array = {2, 2, 1};
        int expectedResult = 1;

        int actualResult = firstProblem.getStrayNumber(array);

        assertEquals(expectedResult, actualResult);
    }
}
