package com.company;

import java.util.Scanner;

public class CodeChefMovieWeekend {

    private static int findBestMovie(int lengths[], int ratings[], int n) {
        int bestMovie = ratings[0] * lengths[0], bestMovieIndex = 0;
        int previousRating = ratings[0];

        for (int i = 1; i < n; i++) {
            if (ratings[i] * lengths[i] >= bestMovie) {
                bestMovie = ratings[i] * lengths[i];
                if (previousRating < ratings[i]) {
                    bestMovieIndex = i;
                    previousRating = ratings[i];
                }
            }
        }
        return bestMovieIndex + 1;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
           /* int lengths[] =takeInput(scanner, n);
            int ratings[] = takeInput(scanner, n);*/

            System.out.println(findBestMovie(takeInput(scanner, n), takeInput(scanner, n), n));

        }
    }

    private static int[] takeInput(Scanner scanner, int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        solve();
    }
}
