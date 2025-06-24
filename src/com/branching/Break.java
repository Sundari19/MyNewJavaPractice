package com.branching;

public class Break {

    public static void main(String[] args) {
        for (int i = 1; i < 3; i = i++) {
            for (int j = 1; j < 3; j = j++) {
                if(i==2)
                    break;
                System.out.println("Value of i is " +i);
                System.out.println("Value of j is " +j);
            }
        }
    }
}
