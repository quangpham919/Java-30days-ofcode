package com.quangpham;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
        public static Node insert(Node head, int data) {
            //Complete this method

            if (head == null) {
                head.data = data;
                head.next = null;
                return head;
            }
            Node current = head;
            Node previous = current;

            while (current != null) {
                previous = current;
                current = current.next;

            }

            current.data = data;
            previous.next = current;
            return head;


        }


        public static void display(Node head) {
            Node start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

    }


