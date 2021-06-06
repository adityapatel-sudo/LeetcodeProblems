package com.company.SchoolProblems;
import java.util.*;
import java.io.*;

public class Sentence {

    // The sentence to manipulate
    private String sentence;
    // return an ArrayList of integer positions containing a
    // blank in this sentence. If there are no blanks in the
    // sentence, returns an empty list.

    public List<Integer> getBlankPositions() {
        // to be implemented in part (a)
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < sentence.length() ; i++){
            if (sentence.charAt(i) == ' '){
                list.add(i);
            }
        }
        return list;
    }

    // return the number of words in this sentence.
    // Precondition: Sentence contains at least one word.
    public int countWords() {
        // to be implemented in part (b)
        int numberWords = 1;
        numberWords += this.getBlankPositions().size();
        return numberWords;
    }

    // return the array of words in this sentence
    // Precondition:
    // - Any two words in the sentence are separated by one blank.
    // - The sentence contains at least one word.
    // Postcondition: String[] returned containing the words in
    // this sentence.

    public String[] getWords() {
        // to be implemented in part (c)
        int numWords = this.countWords();
        List<Integer> blanks = this.getBlankPositions();
        String[] array = new String[numWords];
        array[0] = sentence.substring(0,blanks.get(0));
        for(int i = 1; i < numWords ; i++){
            array[i] = sentence.substring(blanks.get(i-1)+1,blanks.get(i));
        }
        return array;
    }
    // Constructor and other methods are not shown.
}
