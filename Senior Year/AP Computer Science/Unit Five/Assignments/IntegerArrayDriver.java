/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to demonstrate the IntegerArray class
 **/

public class IntegerArrayDriver

{

    public static void main(String[] args)
    
    {

        int[] a = {1,2,3,4,5,4,3,2,1};

        IntegerArray arr = new IntegerArray(a);

        System.out.println(arr.toString());
        System.out.println(arr.indexOf(5));
        System.out.println(arr.indexOf(6));
        System.out.println(arr.isPeak(4));
        System.out.println(arr.isPeak(7));
        System.out.println(arr.isDecreasing(4));
        System.out.println(arr.isIncreasing(4));
        System.out.println(arr.isDiverse());
        arr.append(9);
        System.out.println(arr.toString());
        System.out.println(arr.remove(3));
        System.out.println(arr.toString());
        System.out.println("--------------------");
        arr.fillArray(0,100);
        System.out.println(arr.toString());
        System.out.println(arr.isDiverse());

    }

}
