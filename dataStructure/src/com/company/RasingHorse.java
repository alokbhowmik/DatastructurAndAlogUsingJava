package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RasingHorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int number: arr ) {
            queue.add(number);
        }

        int fist = queue.poll();
        int second = queue.poll();

        System.out.println(second - fist);
    }
}
