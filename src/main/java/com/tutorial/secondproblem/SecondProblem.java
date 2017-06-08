package com.tutorial.secondproblem;


/*A digital root is the recursive sum of all
 the digits in a number. Given n, take the sum
  of the digits of n. If that value has two digits,
   continue reducing in this way until a single-digit
   number is produced. This is only applicable to the natural numbers.
 */
public class SecondProblem {

    public int getSum(final int number) {

        int sum = 0;
        int digitalRoot = number;
        while ((digitalRoot / 10) != 0) {
            while (digitalRoot > 0) {
                sum += (digitalRoot % 10);
                digitalRoot = digitalRoot / 10;
            }
            digitalRoot = sum;
            sum = 0;
        }

        return (digitalRoot);
    }

}
