/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to demonstrate the Numbers class
 **/

public class NumbersDriver

{

    public static void main(String[] args)
    
    {

        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};

        Numbers num = new Numbers(a);
        Numbers num2 = new Numbers(b);

        System.out.println(num.sum());
        System.out.println(num.max());
        System.out.println(num.min());
        System.out.println(num.average());
        System.out.println(num.isIncreasing());
        System.out.println(num2.sum());
        System.out.println(num2.max());
        System.out.println(num2.min());
        System.out.println(num2.average());
        System.out.println(num2.isIncreasing());

    }

}
