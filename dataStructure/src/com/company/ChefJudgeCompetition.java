package com.company;

import java.util.Scanner;

public class ChefJudgeCompetition {

    static int sumOfArrayExceptMaximum(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
       // System.out.println("Sum : " + sum + "Max : " + max);
        return sum - max;
    }

    static String winner(int arr1[], int[] arr2){
        int sum1 = sumOfArrayExceptMaximum(arr1);
        int sum2 = sumOfArrayExceptMaximum(arr2);

       // System.out.println("Sum 1 " +sum1 + "Sum2 " + sum2);
        if (sum1 > sum2){
            return "Bob";
        }else if(sum2> sum1){
            return "Alice";
        }
        return "Draw";
    }

    int[] input(Scanner sc, int n){
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    void solution(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int alice[] = input(sc, n);
            int bob[] = input(sc, n);
            System.out.println(winner(alice, bob));
        }
        /*int alice[] = {3, 1, 3, 3, 4};
        int bob[] = {1, 6, 2,5, 3};
        System.out.println(winner(alice, bob));*/
    }
    public static void main(String[] args) {
       ChefJudgeCompetition obj = new ChefJudgeCompetition();
       obj.solution();
    }
}
/*
5
        3 1 3 3 4
        1 6 2 5 3
        5
        1 6 2 5 3
        3 1 3 3 4
        3
        4 1 3
        2 2 7*/
