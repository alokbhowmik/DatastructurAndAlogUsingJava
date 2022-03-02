package com.company;

import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) {
        // write your code here

        SinglyLinkList linkList = new SinglyLinkList();
      //  DoubleLinkList linkList = new DoubleLinkList();

        for (int i = 0; i < 10; i++) {
            int data = (int) (Math.random() * 100);
            linkList.createLinkList(data);
        }
        linkList.showLinkList();

        Node head = linkList.reverseLinkList();
        linkList.showList(head);
       // linkList.findMiddle();
        //linkList.reverseLinkList();
        /*int k = (int) Math.random() * 10;
        linkList.deleteNode(10, k);*/
//        linkList.insertInStart(5000);

        /*linkList.insertInPosition(0, 5000);
        linkList.insertInPosition(500, 7000);
        linkList.showLinkList();

        linkList.deleteNode(100);
        linkList.showLinkList();*/


    }
}
/*

import java.util.Scanner;
class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        if(r>20 && r<30){
            double area = 3.14159 * r*r;
            System.out.printf("%.2f",area);
        }else {
            System.out.println("Wrong Radius Entry");
        }
    }
}*/
