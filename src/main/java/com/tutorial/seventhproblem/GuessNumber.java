package com.tutorial.seventhproblem;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dandrunakievich on 6/22/2017.
 */
public class GuessNumber {
    public static void Guess() {
        Random rand = new Random();
        int num = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0 || number > 100) {
            System.out.println("Bad input");
            number = sc.nextInt();
        }

        while (number != num) {
            if (number > num) {
                System.out.println("Number is less. Try again:");

                number = sc.nextInt();
            }

            if (number < num) {
                System.out.println("Number is more. Try again:");
                number = sc.nextInt();
            }
        }
        if (number == num) {
            System.out.println("You Win. Game over.");
        }
    }

    public static void main(String[] args) {
        Guess();
    }
}
