package com.company;

public class TcsNqt2018 {

    static int findPrimeNoInPosition(int pos) {
        int i;

        if (pos == 1) return 2;
        else if (pos == 2) return 3;
        else {
            if (pos % 2 == 0) {
                i = (pos - 1) / 2;
                return 6 * i + 1;
            } else {
                i = pos / 2;
                return 6 * i - 1;
            }
        }
    }

    static int findFibonacciInPosition(int pos) {
        int a = 1;
        int b = 1;

        for (int i = 2; i < pos; i++) {
            int fibo = a + b;
            a = b;
            b = fibo;
        }
        return b;
    }

    static int solution(int pos) {
        if (pos % 2 == 0) {
            return findPrimeNoInPosition(pos / 2);
        } else {
            return findFibonacciInPosition((pos + 1) / 2);
        }
    }


    static String sol(int num) {
        return isArmStrongNo(num) ? "Yes" : "NO";
    }

    static boolean isArmStrongNo(int num) {

        int n = num, rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == num;
    }

    static double findSqrt(double num) {
        double x = num;
        double y = 1;
        double e = 0.00001;

        while (x - y > e) {
            x = (x + y) / 2;
            y = num / x;
        }
        return x;
    }

    static String isKeyword(String keyword) {
        String[] keyWords = {
                "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"
        };

        boolean isKeyword = false;
        for (int i = 0; i < keyWords.length; i++) {
            if (keyWords[i] == keyword) {
                isKeyword = true;
                break;
            }
        }
        return isKeyword ? keyword + " is a keyword" : keyword + " is not a keyword";
    }

    static int reverseNumber(int num) {
        int n = num, reverseNum = 0, rem;

        while (n != 0) {
            rem = n % 10;
            reverseNum = reverseNum * 10 + rem;
            n = n / 10;
        }
        return reverseNum;
    }

    static boolean isPrime(int num) {
        if (num == 2 || num == 3) return true;
        else {
            int i1 = (num - 1) / 6;
            int i2 = (num + 1) / 6;
            return (6 * i1 + 1) == num || (6 * i2 - 1) == num;
        }
    }

    private static boolean isPalindromeString(String s, int first, int last) {
        if (first > last) return true;
        else if (s.charAt(first) == s.charAt(last)) {

            return isPalindromeString(s, first + 1, last - 1);
        }
        return false;
    }

    static boolean checkForPalindromeString(String s) {
        return isPalindromeString(s, 0, s.length() - 1);
    }

    static int primeSumInRange(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i < n2; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static int convertBinary(int num, int binary, int i) {
        if (num == 0) return binary;
        return convertBinary(num / 2, binary + (num % 2) * ((int) Math.pow(10, i)), i + 1);
    }

    static int convertBinary(int n) {
        return convertBinary(n, 0, 0);
    }

    static int minimumHeight(int n) {
        int root = (int) Math.sqrt(1 + 8 * n);
        return (-1 +root)/2;
    }

    public static void main(String[] args) {
      /*  System.out.println(solution(1));
        System.out.println(solution(5));
        System.out.println(solution(7));
        System.out.println(solution(4));
        System.out.println(solution(10));
        System.out.println(solution(11));


        // CHECKING FOR ARMSTRONG NUMBER
        System.out.println(sol(55));
        System.out.println(sol(371));

        //CHECKING FOR KEYWORD

        System.out.println(isKeyword("var"));
        System.out.println(isKeyword("alok"));


        //FIND THE SQRT
        System.out.println(findSqrt(3));
        System.out.println(findSqrt(4));


        //REVERSE NUMBER
        System.out.println(reverseNumber(1));

        // CHECKING IS PRIME OR NOT
        System.out.println(isPrime(7));
        System.out.println(isPrime(5));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));


        //CHECK FOR PALINDROME STRING
        System.out.println(checkForPalindromeString("aaa"));
        System.out.println(checkForPalindromeString("aba"));
        System.out.println(checkForPalindromeString("abca"));
        System.out.println(checkForPalindromeString("abcma"));


        //PRIME SUM IN RANGE
        System.out.println(primeSumInRange(2, 10));
        System.out.println(convertBinary(5));*/


        //Minimum height
        System.out.println(minimumHeight(1));
        System.out.println(minimumHeight(2));
        System.out.println(minimumHeight(3));
        System.out.println(minimumHeight(7));
    }
}
