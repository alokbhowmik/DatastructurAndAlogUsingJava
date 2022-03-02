package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeChefFixedDiposit {


    private static int findNoOfFd(Integer arr[], int n, int k) {

        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum >= k) return i + 1;

        }
        return -1;
    }

    private void solution(){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findNoOfFd(arr, n, k));
        }
    }
    public static void main(String[] args) {

       new CodeChefFixedDiposit().solution();
    }
}
