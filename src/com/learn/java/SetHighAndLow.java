package com.learn.java;
import java.util.Scanner;
public class SetHighAndLow {


    private int highest;
    private int lowest;

    public void topAndBottom()
    {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("set the Highest number");
        this.highest = playerInput.nextInt();
        check(highest);

        System.out.println("set the Lowest Number");
        this.lowest = playerInput.nextInt();
        check(lowest);

        if(lowest >= highest)
            throw new IllegalArgumentException("the lowest has to be Lower than the Highest");



    }

    public int getHighest() {
        return highest;
    }

    public int getLowest() {
        return lowest;
    }

    private int check(int input)
    {
        if(input > -1 && input < 1_000_001)
             return input;
        else
            throw new IllegalArgumentException("Enter A value between 0 and 1,000,000");

    }





}
