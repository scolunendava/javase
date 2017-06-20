package com.tutorial.sixthproblem;

/**
 * Created by dandrunakievich on 6/20/2017.
 */
public class Automobile {

    public void runs() {
    }

    public static void main(String[] args) {
        Automobile[] a = new Automobile[]{new Automobile(), new Audi(), new BMW()};

        for (int i = 0; i < a.length; i++) {
            a[i].runs();
        }

        Audi Auto = new Audi();
        System.out.println(Auto.runs(50));
    }
}



