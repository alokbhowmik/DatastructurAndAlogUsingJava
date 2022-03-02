package com.company;

import java.util.Scanner;

public class PenaltySootout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int round = 0;
            int teamA = 0, teamB = 0;

            int totalRound = sc.nextInt();
            int mid = (totalRound / 2) + 1;
            System.out.println(mid);
            String s = sc.next();
            for (int i = 0; i < s.length(); i += 2) {
                if (mid <= teamA || mid <= teamB) {
                    break;
                }
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                    teamA++;
                } else if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    teamB++;
                }
                round+=2;
            }
            System.out.println(round);
        }
    }
}
