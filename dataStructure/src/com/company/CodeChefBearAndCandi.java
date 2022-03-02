package com.company;

import java.util.Scanner;

public class CodeChefBearAndCandi {

    private static String findWinner(int a, int b) {
        boolean isLimakWin = true;
        int totalOfLimak = 0, totalOfBob = 0;
        int i = 1;
        while (true) {

            if (i % 2 != 0) {
                totalOfLimak += i;
                if (totalOfLimak <= a) {
                   isLimakWin = true;
                }else {
                    break;
                }
            } else {
                totalOfBob += i;
                if (totalOfBob <= b){
                    isLimakWin = false;
                }else {
                    break;
                }
            }
            i++;
        }
        return isLimakWin ? "Limak" : "Bob";
    }

    private static void solve() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            System.out.println(findWinner(sc.nextInt(), sc.nextInt()));
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
