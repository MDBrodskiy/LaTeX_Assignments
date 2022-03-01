/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Delimiters class from 2019 FRQ #3
 **/

import java.util.*;

public class Delimiters

{

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {

        openDel = open;
        closeDel = close;

    }

    public ArrayList<String> getDelimitersList(String[] tokens) {

        ArrayList<String> dels = new ArrayList<String>();

        for (String e : tokens) {

            if (e.equals(openDel)) dels.add(e);
            else if (e.equals(closeDel)) dels.add(e);

        }

        return dels;

    }

    public boolean isBalanced(ArrayList<String> delimiters) {

        int openCount = 0;
        int closeCount = 0;

        for (String e : delimiters) {

            if (e.equals(openDel)) openCount++;
            else if (e.equals(closeDel)) closeCount++;

            if (closeCount > openCount) return false;

        }

        return (openCount == closeCount);

    }

}
