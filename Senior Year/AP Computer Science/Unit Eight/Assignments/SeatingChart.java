/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the SeatingChart class from 2014 FRQ #3
 **/


public class SeatingChart

{

    private Student[][] seats;

    public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {

        seats = new Student[rows][cols];
        int student = 0;

        for (int col = 0; col < cols; col++) {

            for (int row = 0; row < rows; row++) {

                if (student >= studentList.size()) {

                    seats[row][col] = null;

                }

                else {

                    seats[row][col] = studentList.get(student);
                    student++;

                }

            }

        }

    }

    public int removeAbsentStudents(int allowedAbsences) {

        int removed = 0;

        for (int col = 0; col < seats[0].length(); col++) {

            for (int row = 0; row < seats.length; row++) {

                if(seats[row][col] != null) {

                    if (seats[row][col].getAbsenceCount() > allowedAbsences) {

                        seats[row][col] = null;
                        removed++;

                    }

                }

            }

        }

        return removed;

    }

}
