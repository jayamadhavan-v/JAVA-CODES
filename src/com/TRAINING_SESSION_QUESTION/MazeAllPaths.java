package com.TRAINING_SESSION_QUESTION;

import java.util.Scanner;

public class MazeAllPaths {

    static int cnt = 1;

    // Display current path
    static void display(int[][] maze, int N, int M) {
        System.out.println("Path: " + cnt++);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.printf("%2d ", maze[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    // Check if cell is inside grid
    static boolean isSafe(int i, int j, int N, int M) {
        return (i >= 0 && i < N && j >= 0 && j < M);
    }

    // Recursive function to explore all paths
    static void solve(int[][] maze, int i, int j, int N, int M, int val) {
        if (i == N - 1 && j == M - 1) {
            display(maze, N, M);
        } else {
            int next_i, next_j;

            // Move right
            next_i = i;
            next_j = j + 1;
            if (isSafe(next_i, next_j, N, M) && maze[next_i][next_j] == 0) {
                maze[next_i][next_j] = val;
                solve(maze, next_i, next_j, N, M, val);
                maze[next_i][next_j] = 0; // backtrack
            }

            // Move down
            next_i = i + 1;
            next_j = j;
            if (isSafe(next_i, next_j, N, M) && maze[next_i][next_j] == 0) {
                maze[next_i][next_j] = val;
                solve(maze, next_i, next_j, N, M, val);
                maze[next_i][next_j] = 0; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (rows) and M (columns): ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] maze = new int[N][M];

        // Initialize starting point
        maze[0][0] = 1;

        solve(maze, 0, 0, N, M, 1);
    }
}