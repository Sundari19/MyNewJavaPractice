package com.loop;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("Value of i is " +i);
            for (int j = 0; j <= 10; j = j + 2) {
                System.out.println("Value of j is " +j);
            }
        }
    }
}
