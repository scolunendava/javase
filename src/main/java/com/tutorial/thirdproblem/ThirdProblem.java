package com.tutorial.thirdproblem;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dandrunakievich on 6/9/2017.
 */
public class ThirdProblem {
    public static Set<Integer> getunique(int array[]) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {}
}
