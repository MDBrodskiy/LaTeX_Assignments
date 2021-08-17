/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program covers the idea of casting
 **/

import java.util.*;

public class CastingDemo  {
    
    public static void main(String[] args) {
        
        int total = 100;
        int numPeople = 40;
        
        double average = ((double)total / (double)numPeople);
        
        System.out.println("Total: " + total);

        System.out.println("People: " + numPeople);

        System.out.println("Average: " + average);
    }
}
