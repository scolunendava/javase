package com.tutorial.sixthproblem;

/**
 * Created by dandrunakievich on 6/20/2017.
 */
public class Main {
    public static void main(String[]args){
        Run[]a=new Run[]{new Audi(),new BMW()};

        for(int i=0;i<a.length;i++){
            a[i].runs();
        }

        Audi auto=new Audi();
        System.out.println(auto.runs(50));
    }
}
