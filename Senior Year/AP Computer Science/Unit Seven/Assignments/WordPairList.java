/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the WordPairList class from 2018 FRQ #2 
 **/


public class WordPairList

{

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {

        allPairs = new ArrayList<WordPair>();

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() < words[j].length()) {

                    allPairs.add(new WordPair(words[i], words[j]));

                }

                else {

                    allPairs.add(new WordPair(words[j], words[i]));

                }

            }

        }

    }

    public int numMatches() {

        int count = 0;

        for (WordPair e : allPairs) {

            count += (e.getFirst().equals(e.getSecond())) ? 1 : 0;

        }

        return count;

    }

}
