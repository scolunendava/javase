package com.tutorial.fourthproblem;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by dandrunakievich on 6/9/2017.
 */
public class FourthProblemTest {
    private FourthProblem fourthproblem;

    @Before
    public void setUp(){fourthproblem=new FourthProblem();}

    @Test
    public void testGetWordsLength(){
        String[]array={"aaa","word","word","bbb","aaa"};
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("aaa",3);
        expectedResult.put("word",4);
        expectedResult.put("bbb",3);

        Map<String,Integer> actualResult = fourthproblem.getWordsLength(array);
        assertEquals(expectedResult, actualResult);

    }
}
