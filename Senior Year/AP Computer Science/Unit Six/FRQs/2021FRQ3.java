/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains two methods: scoreGuess and findBetterGuess 
 **/

public class 2021FRQ1

{

    public static void main(String[] args) {

    }

    public int scoreGuess(String guess) {

        int count = 0;

        for (int i = 0; i < secret.length() - guess.length() + 1; i++) {

            if (secret.substring(i, i + guess.length).equals(guess)) count++;

        }

        return (count * guess.length() * guess.length());

    }

    public String findBetterGuess(String guess1, String guess2) {

        if (scoreGuess(guess1) > scoreGuess(guess2)) return guess1;
        else if (scoreGuess(guess2) > scoreGuess(guess1)) return guess2;
        else if (guess1.compareTo(guess2) > 0) return guess1;
        return guess2;

    }

}
