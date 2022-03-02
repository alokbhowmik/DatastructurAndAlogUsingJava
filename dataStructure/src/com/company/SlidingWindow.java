package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

    public static void solution(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int startPosition = 0;
        int i;
        for (i = startPosition; i < k; i++) {
            queue.add(arr[i]);
        }
        System.out.print(queue.peek() + " ");
        queue.remove(arr[startPosition++]);

        while (i < arr.length) {
            queue.add(arr[i]);
            System.out.print(queue.peek() + " ");
            queue.remove(arr[startPosition++]);
            i++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,3,2,6,3};
        solution(arr, 3);
    }
}
