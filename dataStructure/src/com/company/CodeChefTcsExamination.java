package com.company;

import java.util.Scanner;

public class CodeChefTcsExamination {

    private static String Dragon = "DRAGON";
    private static String Sloth = "SLOTH";

    class Subject {
        int dsa, toc, da;

        Subject(int dsa, int toc, int da) {
            this.dsa = dsa;
            this.toc = toc;
            this.da = da;
        }

        int total() {
            return dsa + toc + da;
        }
    }


    private static String findBetterRank(Subject dragon, Subject sloth) {
        if (dragon.total() > sloth.total()) return Dragon;
        else if (dragon.total() < sloth.total()) return Sloth;
        else {
            if (dragon.dsa > sloth.dsa) return Dragon;
            else if (sloth.dsa > dragon.dsa) return Sloth;
            else {
                if (dragon.toc > sloth.toc) return Dragon;
                else if (sloth.toc > dragon.toc) return Sloth;
                else return "TIE";
            }
        }
    }


    private void solution() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(
                    findBetterRank(
                            new Subject(sc.nextInt(), sc.nextInt(), sc.nextInt()),
                            new Subject(sc.nextInt(), sc.nextInt(), sc.nextInt())
                    )
            );
        }
    }

    public static void main(String[] args) {
       new CodeChefTcsExamination().solution();
    }
}
