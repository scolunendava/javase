package com.tutorial.fiveproblem;

/**
 * Created by dandrunakievich on 6/16/2017.
 */
public class SpecializationClass {
    public static SpecializationEnum findByAbbr(String abbreviation) {
        for (SpecializationEnum v : SpecializationEnum.values()) {
            if (v.getAbbreviation().equals(abbreviation)) {
                return v;
            }
        }
        return null;


    }

    public static void main(String[] args) {
        System.out.println(findByAbbr("D"));
    }
}
