package com.company;

import java.util.*;

public class RotateArray {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        for (int i = 0; i < d; i++) {
            int num = arr.get(0);
            arr.remove(arr.get(0));
            arr.add(num);
            // System.out.println(arr);
        }
        return arr;
    }

    public static List<String> mostActive(List<String> customers) {
        // Write your code here
        Collections.sort(customers);
        Map<String, Integer> map = new HashMap<>();
        int size = customers.size();
        for (String s : customers) {
            map.put(s, (int) map.getOrDefault(s, 0) + 1);
        }

       List<String> cus = new ArrayList<>();

        for (String customer : customers) {

            double acc = map.get(customer) / size * 100;
            if (acc >= 5.0) {
                cus.add(customer);
            }
        }

        return cus;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        List<Integer> newList = rotateLeft(2, list);
        System.out.println(newList);
    }
}
