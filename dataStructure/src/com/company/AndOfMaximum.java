package com.company;

public class AndOfMaximum {

    private static int getMaximum(int[] arr, int start, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    n = 5, k = 3
    windowSize = n/k = 5/3 = 1
     */
    private static int solution(int arr[], int k) {
        if (k == 1) {
            return getMaximum(arr,0, arr.length);
        } else {
            int windowSize = arr.length / k;
            int maxArr[] = new int[k];
            for (int i = 0; i < arr.length; i = i + windowSize) {

            }
            return 0;
        }
    }

    private static void divide(int arr[], int k) {
        int j = 0;
        int window = arr.length / k;
        int rem = arr.length % k;
        int count = 0;
        int maxArr[] = new int[k];
        int maxIndex = 0;

        if (window * k != arr.length) {
            window += 1;
        }
        // System.out.println(window);
        for (int i = 0; i < arr.length; i++) {

            if (j == window) {
                maxArr[maxIndex] = getMaximum(arr,j-window, window);
                j = 0;
                if (++count == rem) {
                    window--;
                }
                System.out.println();
            }
            System.out.print(arr[i] + " ");

            j++;
        }

        for (int item : maxArr) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 8, 9, 10, 11, 12};
        int k = 5;
        divide(arr, k);
    }
}
