package com.learn.java;

import java.util.Random;
import java.util.Scanner;

public class GamePart {

int randomNumber;

    public void mainGame(int higher, int lower)
    {
        int input;
        Scanner getPlayerInput = new Scanner(System.in);

        this.randomNumber = getRandomNumber(higher, lower);

        do {
            System.out.println("Guess a Number");
            input = getPlayerInput.nextInt();
            if(input > randomNumber)
                System.out.println("The number is Lower");
            else if(input < randomNumber)
                System.out.println("The number is Greater");

            if(input > 1_000_000 || input < 0)
                throw new IllegalArgumentException("yo pick a good number");

        }  while (randomNumber != input);

        System.out.println("You got the Number");


    }


    public int getRandomNumber(int Highest, int Lowest)

    {
    Random r = new Random();

        int randomNumber;
               randomNumber = r.nextInt(Highest-Lowest) + Lowest;


        return randomNumber;
    }
}
