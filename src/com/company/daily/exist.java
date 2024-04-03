package com.company.daily;

public class exist {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        System.out.println(exist(board, "ABCESEEEFS"));

    }

    public static boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == word.charAt(0)) {
                    boolean[][] visited = new boolean[board.length][board[r].length];
                    if (dfs(board, visited, r, c, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, boolean[][] visited, int r, int c, String string, int index) {
        if (string.charAt(index) == board[r][c]) {
            if (index == string.length() - 1) return true;
            visited[r][c] = true;
            if (c+1 < board[r].length && !visited[r][c+1] && dfs(board, visited, r, c+1, string, index + 1)) {
                return true;
            }
            if (c-1 >= 0 && !visited[r][c-1] && dfs(board, visited, r, c-1, string, index + 1)) {
                return true;
            }
            if (r+1 < board.length && !visited[r+1][c] && dfs(board, visited, r+1, c, string, index + 1)) {
                return true;
            }
            if (r-1 >= 0 && !visited[r-1][c] && dfs(board, visited, r-1, c, string, index + 1)) {
                return true;
            }
            visited[r][c] = false;
        }
        return false;
    }

}
