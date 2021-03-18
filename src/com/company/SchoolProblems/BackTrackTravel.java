package com.company.SchoolProblems;

import java.util.Scanner;

public class BackTrackTravel {
    static int finalx, finaly, count;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        finalx = sc.nextInt();
        finaly = sc.nextInt();
        recu(0,0,"");
        System.out.println("count: "+count);
    }
    public static void recu(int x, int y, String moveSoFar){
        if(x==finalx && y == finaly){
            System.out.println("moves:"+ moveSoFar);
            count++;
            return;
        }
        if(y<finaly) recu(x,y+1,moveSoFar+" N");
        if(y<finaly && x < finalx) recu(x+1,y+1,moveSoFar+" NE");
        if(x < finalx) recu(x+1,y,moveSoFar+" E");
    }
}
