/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the CodeWordChecker class from 2018 #3
 **/


public class CodeWordChecker extends StringChecker

{

    private StringChecker chk;
    private String phrase;

    public CodeWordChecker(int min, int max, String phrase) {

        chk = new StringChecker(min, max);
        this.phrase = phrase;

    }

    public StringChecker(String phrase) {

        chk = new StringChecker(6, 20);
        this.phrase = phrase;

    }

    @override
    public boolean isValid(String str) {

        return (super.isValid(str) && !str.contains(phrase));

    }

}
