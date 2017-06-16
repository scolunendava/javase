package com.tutorial.fiveproblem;

/**
 * Created by dandrunakievich on 6/15/2017.
 */
public enum Sex {

    M("Masculine"),
    F("Feminine");
    String description;

    Sex(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}