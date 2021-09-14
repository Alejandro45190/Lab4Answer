package com.mycompany.datastructures;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m != 0) {
            if (queue.isFull())
            {
                int p = queue.get();
                System.out.printf("Queue is full: %d%n", p);
            }
            queue.append(m);
            m = sc.nextInt();
        }
        while (!queue.isEmpty()) {
            int p = queue.get();
            System.out.printf("Queue: %d%n", p);
        }
    }
}