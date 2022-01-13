/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the SparseArray class from 2015 FRQ #3
 **/


public class SparseArray

{

    private int numRows;
    private int numCols;

    private ArrayList<SparseArrayEntry> entries;

    public int getValueAt(int r, int c) {

        for (SparseArrayEntry e : entries) {

            if (e.getRow() == r && e.getCol() == c) {

                return e.getValue();

            }

        }

        return 0;

    }

    public void removeColumn(int col) {

        for (int i = 0; i < entries.size(); i++) {

            if (entries.get(i).getCol() == col) {

                entries.remove(i);
                i--;

            }

            else if (entries.get(i).getCol() > col) {

                entries.set(i, new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol() - 1, entries.get(i).getValue()));

            }

        }

        numCols--;

    }

}
