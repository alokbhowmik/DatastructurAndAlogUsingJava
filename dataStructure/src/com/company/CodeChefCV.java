package com.company;

import java.util.Scanner;

public class CodeChefCV {

    private static int count(String str, int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len && isVowel(str.charAt(i + 1)) && !isVowel(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            //sc.next();
            String str = sc.next();
            System.out.println(count(str, n));
        }
    }

    public static void main(String[] args) {
       solve();
    }
}
