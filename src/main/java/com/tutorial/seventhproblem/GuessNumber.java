package com.tutorial.seventhproblem;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dandrunakievich on 6/22/2017.
 */
public class GuessNumber {
    public static void Guess() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
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
                System.out.println("Wrong number. Use numbers from 1 to 100.");
                continue;
            }

            if (number > randomNumber) {
                System.out.println("Number is less. Try again:");
                continue;
            } else {
                System.out.println("Number is more. Try again:");
                continue;
            }
        }
        while (number != randomNumber);
        System.out.println("You Win. Game over.");
    }

    public static void main(String[] args) {
        Guess();
    }
}
