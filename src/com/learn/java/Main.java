
package com.learn.java;

public class Main
{



    public static void main(String[] args)
    {
    var getValues = new SetHighAndLow();
    getValues.topAndBottom();
    int Highest = getValues.getHighest();
    int Lowest = getValues.getLowest();


        var game = new GamePart();
        game.mainGame(Highest, Lowest);


    }



    }