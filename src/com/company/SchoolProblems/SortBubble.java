package com.company.SchoolProblems;

import java.util.LinkedList;
import java.util.Scanner;

public class SortBubble {
    static LinkedList<Integer> array;
    public static void main(String[] args){
        array = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10;i++){
            array.add(sc.nextInt());
        }
        System.out.println(array);
    }
    public static void bubbleSort(){
        int ival;
        for(int i = 0 ; i < array.size()-1;i++){
            ival = array.get(i);
            for (int j = i+1; j< array.size();j++){

                if(ival<array.get(j)){
                    array.add(j,ival);
                    array.remove(i);
                }
            }
        }
    }

}
