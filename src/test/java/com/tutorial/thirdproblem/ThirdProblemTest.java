package com.tutorial.thirdproblem;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by dandrunakievich on 6/9/2017.
 */

public class ThirdProblemTest {
    private ThirdProblem thirdproblem;
    @Before
    public void setUp() {
        thirdproblem = new ThirdProblem();
    }

    @Test
    public void testGetUniqueNumbers() {
        Integer[] array = {1, 2, 3, 4, 1, 2, 5, 4, 0};
        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(new Integer("0"));
        expectedResult.add(new Integer("1"));
        expectedResult.add(new Integer("2"));
        expectedResult.add(new Integer("3"));
        expectedResult.add(new Integer("4"));
        expectedResult.add(new Integer("5"));

        Set<Integer> actualResult = thirdproblem.getUnique( array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetUniqueNumberSecond() {
        Integer[] array = {11, 23, 11, 54, 678, 6, 54};
        Set<Integer> expectedResult = new HashSet<Integer>();
        expectedResult.add(new Integer("11"));
        expectedResult.add(new Integer("23"));
        expectedResult.add(new Integer("54"));
        expectedResult.add(new Integer("678"));
        expectedResult.add(new Integer("6"));

        Set<Integer> actualResult = thirdproblem.getUnique(array);
        assertEquals(expectedResult, actualResult);
    }
}