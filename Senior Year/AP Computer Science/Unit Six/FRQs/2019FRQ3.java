/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains two methods: getDelimetersList and isBalanced
 **/

public class 2019FRQ3

{

    public static void main(String[] args)
    
    {

    }

    public ArrayList<String> getDelimetersList(String[] tokens) {

        ArrayList<String> onlyTokens = new ArrayList<String>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {

                onlyTokens.add(tokens[i]);

            }

        }

        return onlyTokens;

    }

    public boolean isBalanced(ArrayList<String> delimiters) {

        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < delimiters.size(); i++) {

            if (ArrayList.get(i).equals(closeDel)) {

                closeCount++;

                if (closeCount > openCount) return false;

            }

            else if (ArrayList.get(i).equals(openDel)) {

                openCount++;

            }

        }

        return (openCount == closeCount);

    }

}
