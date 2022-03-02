package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class CoinAndTriangle {

    static int minimumHeight(int n) {
        int root = (int) Math.sqrt(1 + 8 * n);
        return (-1 + root) / 2;
    }

    static boolean isSimilarDishes(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
            set.add(s2[i]);
        }
        return set.size() <= 6;
    }

    static String similarDishes(String[] s1, String[] s2) {
        return isSimilarDishes(s1, s2) ? "similar" : "dissimilar";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s1 = new String[4];
        String[] s2 = new String[4];
        while (t-- > 0) {
           /* int n = sc.nextInt();
            System.out.println(minimumHeight(n));*/

            for (int i=0;i<4; i++){
                s1[i] = sc.nextLine();
            }

            for (int i=0;i<4; i++){
                s2[i] = sc.nextLine();
            }
            System.out.println(similarDishes(s1, s2));
        }
/*
        String s1[] = {"eggs", "sugar", "flour", "salt"};
        String s2[] = {"sugar", "eggs", "milk", "flour"};

        String s3[] = {"cookies", "sugar", "grass", "lemon"};
        String s4[] = {"lemon", "meat", "chili", "wood"};

        String s5[] = {"aa", "ab", "ac", "ad"};
        String s6[] = {"ac", "ad", "ae", "af"};*/


    }
}
