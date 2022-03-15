/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the WordMatch class from 2021 FRQ #1
 **/

public class WordMatch

{

    private String secret;

    public WordMatch(String word) {

        secret = word.toLowerCase();

    }

    public int scoreGuess(String guess) {

        int count = 0;

        for (int i = 0; i < secret.length(); i++) {

            if (secret.substring(i, i + 1).equals(guess)) count++;

        }

        return count * guess.length() * guess.length();

    }

    public String findBetterGuess(String guess1, String guess2) {

        if (scoreGuess(guess1) > scoreGuess(guess2)) return guess1;
        else if (scoreGuess(guess2) > scoreGuess(guess1)) return guess2;
        else {

            if (guess1.compareTo(guess2) > 0) return guess1;
            else { return guess2; }

        }

    }

}
