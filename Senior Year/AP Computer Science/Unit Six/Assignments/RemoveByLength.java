/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains a method to remove strings of a certain length from an ArrayList
 **/

import java.util.ArrayList;

public class RemoveByLength

{

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Random");
        list.add("Words");
        list.add("To");
        list.add("Test");
        list.add("This");
        list.add("Method");
        System.out.println(list);
        removeByLength(list, 4);
        System.out.println(list);

    }

    public static void removeByLength(ArrayList<String> words, int len) {

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).length() <= len) {

                words.remove(i);
                i--;

            }

        }

    }


}
