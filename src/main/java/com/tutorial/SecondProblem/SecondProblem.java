package com.tutorial.SecondProblem;


/*A  digital root is the recursive sum of all
 the digits in a number. Given n, take the sum
  of the digits of n. If that value has two digits,
   continue reducing in this way until a single-digit
   number is produced. This is only applicable to the natural numbers.
 */
public class SecondProblem {

    public static int getSum(int number) {

        int sum = 0;
        while ((number/10)!=0){
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;

        }
        number = sum;
            sum =0;

        }

        return (number);
    }

}
