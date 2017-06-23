package com.tutorial.seventhproblem;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dandrunakievich on 6/22/2017.
 */
public class guessNumber {
    public static void guess() {
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1;
        System.out.println("You are guessing a number. Input a number from 1 to 100: ");

        Scanner sc = new Scanner(System.in);
        int number = 1;
        do {
            try {
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Wrong character Use numbers from 1 to 100.");
                continue;
            }

            if (number < 1 || number > 100) {
                System.out.println("Bad input");
                continue;
            }

            if (number != randomnumber) {
                if (number > randomnumber) {
                    System.out.println("Number is less. Try again:");
                    continue;
                } else {
                    System.out.println("Number is more. Try again:");
                    continue;
                }
            } else {
                System.out.println("You Win. Game over.");
            }
        }
        while (number != randomnumber);
    }

    public static void main(String[] args) {
        guess();
    }
}
