package com.company;

import java.util.Scanner;

public class FindMaximumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            String[] nums = str.split(" ");
            int[] numbers = new int[nums.length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(nums[i]);

            }
            System.out.println(solve(numbers));
        }

    }

    private static int solve(int[] numbers) {
        int max = 0;
        for (int num :
                numbers) {

            if (num != numbers.length - 1) {
                if (max < num) {
                    max = num;

                }
            }

        }

        return max;
    }
}
