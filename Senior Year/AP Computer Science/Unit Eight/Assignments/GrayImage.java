/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the GrayImage class from 2012 FRQ #4
 **/


public class GrayImage

{

    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues; 

    public GrayImage(int rows, int cols) {

        pixelValues = new int[rows][cols];

    }

    public int countWhitePixels() {

        int count = 0;

        for (int row = 0; row < pixelValues.length; row++) {

            for (int col = 0; col < pixelValues[0].length; col++) {

                if (pixelValues[row][col] == WHITE) count++;

            }

        }

        return count;

    }

    public void processImage() {

        for (int row = 0; row < pixelValues.length - 2; row++) {

            for (int col = 0; col < pixelValues[0].length - 2; col++) {

                if (pixelValues[row][col] - pixelValues[row + 2][col + 2] < 0) pixelValues[row][col] = 0;
                else { pixelValues[row][col] -= pixelValues[row + 2][col + 2] }

            }

        }

    }

}
