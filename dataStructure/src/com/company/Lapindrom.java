package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Lapindrom {

   /* Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
    Your task is simple. Given a string, you need to tell if it is a lapindrome.*/

    public static String solution(String string1, String string2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            map.put(string1.charAt(i), map.getOrDefault(string1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < string2.length(); i++) {
            if (!map.containsKey(string2.charAt(i))) return "NO";
            if (map.get(string2.charAt(i)) == 1) {
                map.remove(string2.charAt(i));
            } else
                map.put(string2.charAt(i), map.get(string2.charAt(i)) - 1);

        }
        return map.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        //gatga -->
        //01234 -->
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String string = sc.next();
            int len = string.length();
            int mid = len / 2;
            if (len % 2 == 0) {
                // 0 .. mid, mid .. len
                System.out.println(

                        solution(string.substring(0, mid), string.substring(mid, len))
                );

            } else {
                //0..mid, mid+1..len
                System.out.println(

                        solution(string.substring(0, mid), string.substring(mid + 1, len))
                );
            }
        }
    }
}
