/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to describe a player
 **/

public class Player

{

    private static int highScore; 

    private String name; 
    private int score;

    public Player() {

        this.name = "";
        score = 0;

    }

    public Player(String name) {

        this.name = name;
        score = 0;

    }

    public void add(int num) {

        if (num > 0) {

            score += num;

        }

        if (score > highScore) {

            highScore = score;

        }

    }

    public boolean winning() {

        return score == highScore;

    }

    public String toString() {

        return name + ": " + score;

    }

    public int getHighScore() {

        return highScore;

    }

    public void reset() {

        highScore = 0;

    }

}
