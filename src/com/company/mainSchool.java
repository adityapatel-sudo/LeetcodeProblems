package com.company;
import java.util.*;

public class mainSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("no "+'u' +"Joe");

    }
    public static boolean checkVert(int[][] array){
        int temp = 0,k=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<9;i++){
            map.clear();
            for(int j = 0; j< 9;j++){
                if(map.containsKey(array[j][i])){
                    return false;
                }
                map.put(array[j][i], j);
            }

        }
        return true;
    }
    public static boolean checkHorz(int[][] array){
        int temp = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<9;i++){
            map.clear();
            for(int j = 0; j< 9;j++){
                if(map.containsKey(array[i][j])){
                    return false;
                }
                map.put(array[i][j], j);
            }

        }
        return true;
    }

}
