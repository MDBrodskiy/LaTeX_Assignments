/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the Crossword class from 2016 FRQ #3
 **/


public class Crossword

{

    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {

        puzzle = new Square[blackSquares.length][blackSquares[0].length];

        int count = 1;

        for (int row = 0; row < blackSquares.length; row++) {

            for (int col = 0; col < blackSquares[0].length; col++) {

                if (blackSquares[row][col]) puzzle[row][col] = new Square(true, 0);

                else {

                    if (toBeLabeled(row, col, blackSquares)) {
                        
                        puzzle[row][col] = new Square(false, count);
                        count++;

                    }

                    else { 

                        puzzle[row][col] = new Square(false, 0);

                    }

                }

            }

        }

    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {

        if (r > 0 && c > 0) return (!blackSquares[r][c] && (blackSquares[r - 1][c] || blackSquares[r][c - 1]));

        else if (r == 0 || c == 0) return true;

        return false;

    }

}
