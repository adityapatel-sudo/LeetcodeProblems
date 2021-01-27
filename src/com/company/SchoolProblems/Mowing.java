package com.company.SchoolProblems;
//https://classroom.google.com/u/0/c/MTMwOTA5MjcxMDM1/a/MjUwNDI1ODQ3NzQy/details

import com.company.Print2DIntArray;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Mowing {

    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lawns = s.nextInt();
        while (lawns > 0) {
            int l = s.nextInt();
            int width = s.nextInt();
            int[][] lawn = new int[l][width];
            int x = s.nextInt(), y = s.nextInt();
            int[][] before = new int[l][width];
            fillArray(s, l, width, lawn, before);
            recu(lawn, y, x);
            fillAfter(lawn);
            print(lawn, before);
            lawns--;
            out.println("\n\n\n\n\n\n\n\n\n\n");
        }
        out.close();
    }

    static void recu(int[][] lawn, int y, int x) {

        lawn[y][x] = 8;
        Print2DIntArray.PrintArray(lawn);
        System.out.println();
        lawn[y][x] = 9;

        if (lawn[y - 1][x] == 0) recu(lawn, y - 1, x);
        if (lawn[y][x + 1] == 0) recu(lawn, y, x + 1);
        if (lawn[y + 1][x] == 0) recu(lawn, y + 1, x);
        if (lawn[y][x - 1] == 0) recu(lawn, y, x - 1);

        lawn[y][x] = 8;
        Print2DIntArray.PrintArray(lawn);
        lawn[y][x] = 2;

        System.out.println();
    }

    static void fillArray(Scanner scanner, int l, int w, int[][] map, int[][] be) {
        Arrays.fill(map[0], 1);
        Arrays.fill(map[map.length - 1], 1);
        for (int i = 0; i < l; i++) {
            map[i][0] = 1;
            map[i][w - 1] = 1;
        }

        for (int i = 0; i < l; i++) {
            for (int ii = 0; ii < w; ii++) {
                String string = scanner.next();
                if (string.equals("T")) {
                    map[i][ii] = 1;
                    be[i][ii] = 1;
                    if (i > 0) {
                        map[i - 1][ii] = 1;
                        if (ii > 0) map[i - 1][ii - 1] = 1;
                        if (ii < w - 1) map[i - 1][ii + 1] = 1;
                    }
                    if (i < l - 1) {
                        map[i + 1][ii] = 1;
                        if (ii > 0) map[i + 1][ii - 1] = 1;
                        if (ii < w - 1) map[i + 1][ii + 1] = 1;
                    }
                    if (ii > 0) map[i][ii - 1] = 1;

                    if (ii < w - 1) map[i][ii + 1] = 1;
                }
            }
        }
    }

    static void fillAfter(int[][] map) {
        int length = map.length;
        int width = map[0].length;

        for (int i = 0; i < length; i++) {
            for (int ii = 0; ii < width; ii++) {
                if (map[i][ii] == 2) {
                    if (i > 0) {
                        if (map[i - 1][ii] != 2) map[i - 1][ii] = 3;
                        if (ii > 0 && map[i - 1][ii - 1] != 2) map[i - 1][ii - 1] = 3;
                        if (ii < width - 1 && map[i - 1][ii + 1] != 2) map[i - 1][ii + 1] = 3;
                    }
                    if (i < length - 1) {
                        if (map[i + 1][ii] != 2) map[i + 1][ii] = 3;
                        if (ii > 0 && map[i + 1][ii - 1] != 2) map[i + 1][ii - 1] = 3;
                        if (ii < width - 1 && map[i + 1][ii + 1] != 2) map[i + 1][ii + 1] = 3;
                    }
                    if (ii > 0 && map[i][ii - 1] != 2) map[i][ii - 1] = 3;
                    if (ii < width - 1 && map[i][ii + 1] != 2) map[i][ii + 1] = 3;
                }
            }
        }
    }

    static void print(int[][] map, int[][] b) {
        int length = map.length;
        int width = map[0].length;
        for (int i = 0; i < length; i++) {
            for (int ii = 0; ii < width; ii++) {
                if (b[i][ii] == 1 && map[i][ii] == 1) System.out.print("T ");
                else if (map[i][ii] == 2 || map[i][ii] == 3) System.out.print("C ");
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
