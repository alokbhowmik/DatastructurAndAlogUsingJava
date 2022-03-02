package com.company;

import java.util.Scanner;

public class FlatLand {

    static int solution(int num, int circles) {
        if (num == 0) return circles;
        int root = (int) Math.pow(num, 0.5);
        return solution(num - root * root, circles + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            System.out.println(solution(num, 0));
        }
    }
}
