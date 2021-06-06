package com.company.problems;

public class OneSixEightNine {
    public static void main(String[] args){

    }
    public static int minPartitions(String n){
        int max = 0;
        for(int i = 0; i < n.length();i++){
            int i1 = Integer.parseInt(String.valueOf(n.charAt(i)));
            if(i1 >max){
                max= i1;
            }
            if(max==9) return max;
        }
        return max;
    }
}
















