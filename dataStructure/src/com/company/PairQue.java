package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PairQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i=0;i<3;i++){
                int num = sc.nextInt();
                queue.add(num);
            }

            int first = queue.poll();
            int second = queue.poll();
            int third = queue.poll();
            if (first + second == third) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
