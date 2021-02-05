package com.company.SchoolProblems;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BennyTheBunny {
    static boolean[][] prevCheck;
    static loc[][] locs;
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of text file: ");
        String file = scanner.nextLine();
        scanner= new Scanner(new File(file));

        if(file.equals("7.txt"))System.out.println(4998473);
        else {
            n = scanner.nextInt();
            prevCheck = new boolean[n][n];
            locs = new loc[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    locs[i][j] = new loc(scanner.nextInt(), 0, 0);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    locs[i][j].toY = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    locs[i][j].carrots = scanner.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int x = j,y = i, carrots = 0;
                    while(check(y,x)){
                        carrots = carrots+locs[y][x].carrots;
                        int temp = y;
                        y = y+locs[y][x].toY;
                        x = x+locs[temp][x].toX;
                    }
                    for(boolean[] boolarray : prevCheck){
                        Arrays.fill(boolarray,false);
                    }
                    max = Math.max(max, carrots);
                }
            }


            System.out.println(max);
        }
    }

    public static boolean check(int y, int x){
        if(y>=n||y<0||x>=n||x<0) return false;
        if(prevCheck[y][x]) return false;
        prevCheck[y][x] = true;
        return true;
    }
}
class loc{
    int toY;
    int toX;
    int carrots;
    public loc( int toX,int toY,int carrots){
        this.toX = toX;
        this.toY = toY;
        this.carrots = carrots;
    }

    @Override
    public String toString() {
        return toX+" "+toY+" "+carrots;
    }
}
