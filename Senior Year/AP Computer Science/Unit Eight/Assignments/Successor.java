/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Successors class from 2017 FRQ #4
 **/


public class Successors

{

    public static Position findPosition(int num, int[][] intArr) {

        for (int row = 0; row < intArr.length; row++) {

            for (int col = 0; col < intArr[0].length; col++) {

                if (intArr[row][col] == num) return new Position(row, col);

            }

        }

        return null;

    }

    public static Position[][] getSuccessorArray(int[][] intArr) {

        Position[][] posArr = new Position[intArr.length][intArr[0].length];

        for (int row = 0; row < intArr.length; row++) {

            for (int col = 0; col < intArr[0].length; col++) {

                Position[row][col] = findPosition(intArr[row][col] + 1, intArr);

            }

        }

        return posArr;

    }

}
