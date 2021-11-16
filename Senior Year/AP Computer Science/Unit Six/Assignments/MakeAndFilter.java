/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains two methods: make and filter
 **/

import java.util.ArrayList;

public class MakeAndFilter

{

    public static void main(String[] args)
    
    {

        ArrayList<String> list = new ArrayList<String>();
        list.add("E");
        list.add("Nope");
        list.add("G");
        list.add("F");
        list.add("Stays");
        list.add("Good");
        filter(list);
        System.out.println(list);

    }

    public static ArrayList<Integer> make(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int e : arr) {

            list.add(e);

        }

        return list;

    }

    public static void filter(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() <= 2) {

                list.remove(i);
                i -= 1;

            }

        }

    }

}
