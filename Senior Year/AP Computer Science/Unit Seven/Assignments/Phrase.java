/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Phrase class from 2017 FRQ #3
 **/


public class Phrase

{

    private String currentPhrase;

    public Phrase(String p) {

        currentPhrase = p;

    }

    public void replaceNthOccurrence(String str, int n, String repl) {

        int index = findNthOccurrence(str, n);

        if (index != -1) {

            String tmp = currentPhrase.substring(0,index) + repl + currentPhrase.substring(index + str.length());

            currentPhrase = tmp;

        }

    }

    public int findLastOccurrence(String str) {

        for (int i = currentPhrase.length(); i >= str.length; i--) {
            
            if (str.equals(currentPhrase.substring(i - str.length, i))) return (i - str.length());

        }

        return -1;

    }

}
