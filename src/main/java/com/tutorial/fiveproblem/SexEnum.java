package com.tutorial.fiveproblem;

/**
 * Created by dandrunakievich on 6/15/2017.
 */
public enum SexEnum {

    MALE("M"),
    FEMALE("F");
    private String description;

    SexEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public SexEnum findByDesc(String description){
        for(SexEnum v : SexEnum.values()){
            if(v.getDescription().equals(description)){
                return v;
            }
        }
        return null;
    }
}