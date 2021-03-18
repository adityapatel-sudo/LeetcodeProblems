package com.company.SchoolProblems;

import java.util.Scanner;

public class MoveDisks {
    static int numDisks, count = 0;
    static String destPost, tempPost;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        numDisks = scanner.nextInt();
        System.out.print("Enter destination post: ");
        destPost = scanner.next();
        tempPost = (destPost.equals("B")) ? "C": "B";

        recu(numDisks,"A",destPost,tempPost);
        System.out.println("Number of moves: "+ count);

    }
    public static void recu(int n, String from, String to, String temp){
        if(n==1) moveOneDisk(from,to);
        else{
            recu(n-1,from,temp,to);
            moveOneDisk(from,to);
            count++;
            recu(n-1,temp,to,from);
        }
    }
    public static void moveOneDisk(String source, String dest){
        System.out.println("Move disk from " + source + " -> " + dest);
    }
}
