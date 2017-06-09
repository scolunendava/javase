package com.tutorial.thirdproblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Given an array of numbers. Return a collection of all unique values:
Ex:
[1, 3, 5, 2, 3, 1, 3, 1]  -> [1, 3, 5, 2]

 */
public class ThirdProblem {

    public Set<Integer> getUnique(Integer[] array) {
        Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(array));
        //for (int i = 0; i < array.length; i++) {
         //   numbers.add(array[i]);
       // }
        return numbers;
    }

}
