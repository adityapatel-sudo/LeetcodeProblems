package com.company;
import com.company.arrayandstring.PascalsTriangle2DArray;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("printStarsForLoop");
        Scanner sc = new Scanner(System.in);
        method(sc.nextInt());

    }
    public static void method(int number){
        if(number != 0){
            System.out.println(number);
            method(number-1);
            System.out.println(number);

        }
    }

}
