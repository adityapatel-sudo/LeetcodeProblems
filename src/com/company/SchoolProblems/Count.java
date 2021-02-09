package com.company.SchoolProblems;

import java.util.*;

public class Count {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> array;
    static ArrayList<Integer> ans;

    public static void main(String[] args){
        System.out.println("\nPlease enter an alphabetical sequence of strings separated\n" +
                "by spaces. The end of the sequence must be signified using\n" +
                "the sentinel value lastString, followed by a return.\n");

        array = new ArrayList<>();
        ans = new ArrayList<>();
        while(true){
            String temp = in.next();
            if(temp.equals("lastString")) break;
            array.add(temp.toLowerCase());
        }
        HashSet<String> noDoub = new HashSet<>();
        for(int i = 0; i< array.size();i++){
            if(!noDoub.contains(array.get(i))){
                int temp = 1;
                for(int j = i+1;j< array.size();j++){
                    if(array.get(j).equals(array.get(i)))temp++;
                }
                ans.add(temp);
            }
            noDoub.add(array.get(i));
        }
        Collections.sort(ans);
        System.out.println("\nYour original list: "+array);
        System.out.println("Count: "+ ans);
    }
}
