/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the LightBoard class from 2019 #4
 **/

public class LightBoard

{

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {

        lights = new boolean[numRows][numCols];

        for (int row = 0; row < numRows; row++) {

            for (int col = 0; col < numCols; col++) {

                if ((int)(10 * Math.random) <= 3) lights[row][col] = true;
                else { lights[row][col] = false; }

            }

        }

    }

    public boolean evaluateLight(int row, int col) {

        int lightsInCol = 0;

        for (int i = 0; i < lights.length; i++) {

            if (lights[i][col]) lightsInCol++;

        }

        if (lights[row][col]) {

            if (lightsInCol % 2 == 0) return false;

        }

        else if (!lights[row][col]) {

            if (lightsInCol % 3 == 0) return true;

        }
         
        else {

            return lights[row][col];

        }

    }

}
