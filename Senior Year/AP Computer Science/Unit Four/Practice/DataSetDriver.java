/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to test the DataSet class
 **/

import java.util.*;

public class DataSetDriver

{

    public static void main(String[] args) {

        DataSet ds = new DataSet();

        System.out.println(ds.average());
        ds.add(5);
        System.out.println(ds.average());
        ds.add(3);
        System.out.println(ds.max());
        System.out.println(ds.average());
        ds.add(8);
        System.out.println(ds.max());
        System.out.println(ds.average());

    }

}
