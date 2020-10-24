package com.company;
import java.util.Scanner;

public class mainSchool {
    public static void main(String[] args) {
        String input = "edingerstinger";
        String back = "";
        for(int i = input.length()-1; i >=0;i--){
            back =  input.charAt(i)+back;
            i--;
        }
        System.out.println(back);
    }
}









