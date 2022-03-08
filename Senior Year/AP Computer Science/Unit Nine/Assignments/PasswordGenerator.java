/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the PasswordGenerator class
 **/

import java.util.ArrayList;

public class PasswordGenerator

{

    private ArrayList<String> passList;
    private String prefix;
    private int length;

    public PasswordGenerator(int len) {

        prefix = "A";
        length = len;
        passList = new ArrayList<String>();

    }
    
    public PasswordGenerator(int len, String pref) {

        prefix = pref;
        length = len;
        passList = new ArrayList<String>();

    }

    public int pwCount() {

        return passList.size();

    }

    public String pwGen() {

        String pass = prefix + ".";

        for (int i = 0; i < length; i++) {

            pass += (int)(9 * Math.random());

        }

        passList.add(pass);
        return pass;

    }

}
