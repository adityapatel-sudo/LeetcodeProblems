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
        System.out.print("bubbleSort\n");
        bubbleSort();

        System.out.println(array+"\n");

    }
    public static void bubbleSort(){
        int ival;
        int i = 0;
        for(int cursor = 0 ; cursor < array.size()-1;cursor++,i++){
            if(array.get(i)>array.get(i+1)){
                ival = array.get(i);
                for (int j = i; j< array.size();j++){
                    if(ival<array.get(j)){
                        array.add(j,ival);
                        array.remove(i);
                        break;
                    }else if (j == array.size()-1){
                        array.add(ival);
                        array.remove(i);
                        break;
                    }
                }
                i--;
            }
            System.out.println(array);
        }
    }
}
