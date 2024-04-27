package com.company.daily;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/minimum-falling-path-sum-ii/?envType=daily-question&envId=2024-04-26
 */
public class MinFallingPathSum2 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{-73,61,43,-48,-36},
                {3,30,27,57,10},
                {96,-76,84,59,-15}
                ,{5,-49,76,31,-7}
                ,{97,91,61,-46,67}};
        MinFallingPathSum2 min = new MinFallingPathSum2();
        int res = min.minFallingPathSum(grid);
        System.out.println(res);
    }
    public int minFallingPathSum(int[][] grid) {
        int[][] greedy = new int[grid.length][grid.length];
        int min = Integer.MAX_VALUE;

        System.arraycopy(grid[0], 0, greedy[0], 0, grid.length);
        for (int i = 0; i < grid.length; i++) {
            if (greedy[0][i] < min) {
                min = greedy[0][i];
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                greedy[i][j] = min;
            }
            min = Integer.MAX_VALUE;
            for (int j = 0; j < grid.length; j++) {
                if (greedy[i][j] < min) {
                    min = greedy[i][j];
                }
            }
        }
        min = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            if (greedy[grid.length-1][i] < min) {
                min = greedy[grid.length-1][i];
            }
        }
        return min;
    }
    public class Node implements Comparable<Node>{
        int val;
        int valSoFar;
        int row;
        int col;
        int path[];
        public Node(int val,int valSoFar, int row, int col, int[] path){
            this.val = val;
            this.valSoFar = valSoFar;
            this.row = row;
            this.col = col;
            this.path = path;
        }

        @Override
        public int compareTo(MinFallingPathSum2.Node o) {
            return Integer.compare(valSoFar, o.valSoFar);
        }

        @Override
        public String toString() {
            return "val: " + val+" valsofar:" + valSoFar + " row:" + row + " col:" + col + Arrays.toString(path);
        }
    }
}
