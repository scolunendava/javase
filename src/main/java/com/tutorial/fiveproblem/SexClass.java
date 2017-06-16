package com.tutorial.fiveproblem;

/**
 * Created by dandrunakievich on 6/16/2017.
 */
public class SexClass {
    public static SexEnum findByDesc(String description){
        for(SexEnum v : SexEnum.values()){
            if(v.getDescription().equals(description)){
                return v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findByDesc("M"));
    }
}
