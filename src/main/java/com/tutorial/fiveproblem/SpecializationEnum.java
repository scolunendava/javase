package com.tutorial.fiveproblem;

/**
 * Created by dandrunakievich on 6/15/2017.
 */

public enum SpecializationEnum {
    DIRECTOR("D"), ENGINEER("E"), MANAGER("M"), BOOKKEEPER("B");

    private String abbreviation;


    SpecializationEnum(String abbreviation) {

        this.abbreviation = abbreviation;

    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

