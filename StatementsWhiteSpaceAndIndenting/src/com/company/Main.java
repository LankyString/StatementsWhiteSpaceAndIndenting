package com.company;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println(myVariable);
        System.out.println("This is a test!");

        int anotherVariable = 50;
        System.out.println(anotherVariable);

        boolean gameOver = true;
        int score = 4000;
        int levelComplete = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000)
        {
            System.out.println("Your Score was less then 5000 but greater then 1000");
        }
        else if(score < 1000)
        {
            System.out.println("Your score was less then 1000");
        }
        else
        {
            System.out.println("Got here");
        }

        if(gameOver)
        {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " +finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelComplete set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelComplete = 8;
        int newBonus = 200;

        if(newScore < 5000 && newScore > 1000)
        {
            System.out.println("Your Score was less then 5000 but greater then 1000");
        }
        else if(newScore < 1000)
        {
            System.out.println("Your score was less then 1000");
        }
        else
        {
            System.out.println("Got here");
        }

        if(newGameOver)
        {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " +finalScore);
        }



    }
}
