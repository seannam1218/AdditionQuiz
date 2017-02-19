package com.company;

/**
 * Created by Sean on 2017-02-18.
 */
public class RandomNumber {
    private int randomNum1;
    private int randomNum2;
    private String answer;

    public RandomNumber() {
        this.randomNum1 = (int) Math.floor((Math.random()*100));
        this.randomNum2 = (int) Math.floor((Math.random()*100));
        this.answer = String.valueOf(this.randomNum1 + randomNum2);
    }

    public int getRandomNum1() {
        return(this.randomNum1);
    }

    public int getRandomNum2() {
        return(this.randomNum2);
    }

    public String getAnswer() {
        return(this.answer);
    }
}
