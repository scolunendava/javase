package com.tutorial.initproject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareNumberTest {

    private SquareNumber squareNumber;

    @Before
    public void setUp() {
        squareNumber = new SquareNumber();
    }

    @Test
    public void testSquareZero() {
        // arrange
        int numberToSquare = 0;
        int expectedResult = 0;

        // act
        int result = squareNumber.square(numberToSquare);

        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSquareNegativeNumber() {
        int numberToSquare = -2;
        int expectedResult = 4;

        int result = squareNumber.square(numberToSquare);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testSquarePositiveNumber() {
        int numberToSquare = 3;
        int expectedResult = 9;

        int result = squareNumber.square(numberToSquare);

       assertEquals(expectedResult, result);
    }

}
