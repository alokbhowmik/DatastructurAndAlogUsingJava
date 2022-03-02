package com.company;

import java.util.Stack;

public class Parentheses {


    public static boolean isValidBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) return false;
                else {
                    if (
                            (stack.peek() == '(' && bracket == ')') ||
                                    (stack.peek() == '{' && bracket == '}') ||
                                    (stack.peek() == '[' && bracket == ']')
                    ) {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static int findMaxArea(int[] arr) {
        Stack<Integer> stack = new Stack();
        int block = 0;
        int min = Integer.MAX_VALUE;
        int area = 0, maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (stack.peek() < min) {
                area = min * block;
                if (maxArea < area) {
                    maxArea = area;
                }
                min = stack.pop();
                block++;
            } else {
                block++;
                stack.pop();
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        String s = "(";
        System.out.println(isValidBrackets(s));
    }
}
