/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the HiddenWord
 **/


public class HiddenWord

{

    private String secret;

    public HiddenWord(String secret) {

        this.secret = secret;

    }

    public String getHint(String guess) {

        String tmp = "";

        for (int i = 0; i < guess.length() - 1; i++) {

            if (guess.substring(i, i + 1).equals(secret.substring(i, i + 1)) {

                tmp += guess.substring(i, i + 1);

            }

            else if (secret.contains(guess.substring(i, i + 1))) {

                tmp += "+";

            }

            else { tmp += "*" }

        }

        return tmp;

    }

}
