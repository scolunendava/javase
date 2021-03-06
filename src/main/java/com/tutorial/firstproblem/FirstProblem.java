package com.tutorial.firstproblem;

/**
 * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 * <p>
 * Implement the method stray which accepts such array, and returns that single different number.
 * <p>
 * The input array will always be valid! (odd-length >= 3)
 * <p>
 * Examples:
 * <p>
 * [1, 1, 2] => 2
 * <p>
 * [17, 17, 3, 17, 17, 17, 17] => 3
 */
public class FirstProblem {

    public int getStrayNumber(int[] array) {

        int number = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != number && number != array[i + 1]) {
                return number;
            }
            if (array[i] != number && number == array[i + 1]) {
                number = array[i];
                return number;
            }

        }
        return array[array.length - 1];
    }

}
