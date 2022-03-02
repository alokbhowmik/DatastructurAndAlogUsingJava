package com.company;

import java.util.Scanner;

public class Football {

    int[] input(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    void solution() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] goal = input(sc, n);
            int[] foul = input(sc, n);


            System.out.println(findBestScore(goal, foul));
        }
    }

    int findBestScore(int[] goal, int[] foul) {
        int best = 0;
        for (int i = 0; i < goal.length; i++) {
            int score = goal[i] * 20 - 10 * foul[i];
            if (best < score) best = score;
        }
        return best;
    }

    public static void main(String[] args) {
        new Football().solution();
    }
}
