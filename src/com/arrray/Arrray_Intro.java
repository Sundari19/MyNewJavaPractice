package com.arrray;

import java.util.Arrays;

public class Arrray_Intro {

    public static void main(String[] args){
        int [] numbers = {1, 2, 3, 4, 5}; //initial on samae line
         System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
 System.out.println(numbers[3]);
numbers[4] = 7 ;
System.out.println(numbers[4]);
System.out.println(Arrays.toString(numbers));

String names[] = {"Hi" , "Hello", "Besant"};
 System.out.println(Arrays.toString(names));
System.out.println(names[2]);


        int age [] = new int[4];  // size
        age[0] =34;
        age[1] = 67;
        age[2] = 56;

        System.out.println(Arrays.toString(age));
        // age[4] = 100;
    }
}
