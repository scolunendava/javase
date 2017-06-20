package com.tutorial.sixthproblem;

public class Audi implements Automobile {

    @Override
    public void runs() {
        System.out.println("120km");
    }

    public int runs(int km) {
        return 150 + km;
    }
}
