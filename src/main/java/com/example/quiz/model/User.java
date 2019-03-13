package com.example.quiz.model;

public class User {

    // tworzymy nowego usera, tak, by nie sumowalo ich punktow podczas gry, zeby mogli grac w tej samej przegladarce
    private Integer numberOfPionts;

    public User(){
        numberOfPionts=0;
    }

    public void addPoint(){
        numberOfPionts++;

    }

    public Integer getNumberOfPionts(){
        return numberOfPionts;
    }

}
