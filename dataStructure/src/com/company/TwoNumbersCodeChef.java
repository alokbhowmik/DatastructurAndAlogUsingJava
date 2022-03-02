package com.company;

import java.util.Scanner;

public class TwoNumbersCodeChef {

    static int solution(int a, int b, int n, int round) {
        if (round == n) {
            return Math.max(a, b) / Math.min(a, b);
        }
        if (round % 2 == 0) {
            return solution(a * 2, b, n, round + 1);
        }
        return solution(a, b * 2, n, round + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(solution(a, b, n, 0));
        }
    }
}
