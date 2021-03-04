package com.company.SchoolProblems;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Count2 {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Term> array;

    public static void main(String[] args){
        System.out.println("\nPlease enter an alphabetical sequence of strings separated\n" +
                "by spaces. The end of the sequence must be signified using\n" +
                "the sentinel value lastString, followed by a return.\n");

        array = new ArrayList<>();
        while(true){
            String temp = in.next();
            if(temp.equals("lastString")) break;
            boolean contain = false;

            //if term exists in arraylist, adds to count
            for(Term x : array){
                if(x.term.equals(temp)){
                    contain = true;
                    x.count++;
                    break;
                }
            }

            //adds to arraylist if term doesn't exist
            if(!contain){
                array.add(new Term(temp,1));
            }
        }

        //sorts using required criteria and prints
        Collections.sort(array);
        for (Term x : array){
            System.out.print(x);
        }
    }
}
class Term implements Comparable<Term>{
    String term;
    int count;
    public Term(String term, int count){
        this.count = count;
        this.term = term;
    }
    @Override
    public int compareTo( Term o) {
        return this.count-o.count;
    }
    public String toString(){
        return term+" "+count+"\n";
    }
}
