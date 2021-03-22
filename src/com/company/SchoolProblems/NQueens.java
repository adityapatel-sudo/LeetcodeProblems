package com.company.SchoolProblems;

import java.util.Scanner;

public class NQueens {
    static int n;
    static int[][] board;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of your board? ");
        n = sc.nextInt();
        board = new int[n][n];
        // 0 means available
        // 1 or greater means taken
        System.out.println();
        recu(0);
        PrintArray(board);
    }
    public static boolean recu(int r){
        if(r == n) return true;
        for(int i = 0 ; i < n;i++){
            if(!checkQueen(r,i)){
                board[r][i] = 1;
            }else continue;

            if(recu(r+1)){
                return true;
            }
            board[r][i] = 0;
        }
        return false;
    }
    public static boolean checkQueen(int r, int c){
        //check horizontal & vert
        for(int i = 0; i < n;i++){
            if (board[r][i]==1 || board[i][c]==1) return true;
        }
        //checks 4 diagonal directions
        int r2, c2;
        for( r2 = r, c2 = c ; r2 <= n-1 && c2 <= n-1  ;c2++,r2++){
            if(board[r2][c2] == 1) return true;
        }
        for( r2 = r, c2 = c ; r2 >= 0 && c2 >= 0      ;c2--,r2--){
            if(board[r2][c2] == 1) return true;
        }
        for( r2 = r, c2 = c ; r2 >= 0 && c2 <= n-1    ;c2++,r2--){
            if(board[r2][c2] == 1) return true;
        }
        for(r2 = r, c2 = c  ; r2 <= n-1 && c2 >0      ;c2--,r2++){
            if(board[r2][c2] == 1) return true;
        }
        return false;
    }
    public static void PrintArray(int[][] array){
        int row = array.length;
        int column = array[0].length;
        for(int i =0;i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
