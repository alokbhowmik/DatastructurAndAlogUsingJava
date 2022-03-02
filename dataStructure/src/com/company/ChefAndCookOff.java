package com.company;

import java.util.Scanner;

public class ChefAndCookOff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while (time-- > 0) {
            int sol[] = new int[5];
            for (int i = 0; i < 5; i++) {
                sol[i] = sc.nextInt();
            }

            solution(sol);
        }
    }

    private static String solution(int[] sol) {

        int totalSolution = 0;
        for (int num : sol) {
            if (num == 1) totalSolution++;
        }

        switch (totalSolution) {
            case 0:
                return "Beginner";
            case 1:
                return "Junior Developer";
            case 2:
                return "Middle Developer";
            case 3:
                return "Senior Developer";
            case 4:
                return "Hacker";

        }
            return "Jeff Dean";
    }
}
