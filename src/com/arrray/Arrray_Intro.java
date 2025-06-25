package com.arrray;

import java.util.Arrays;

public class Arrray_Intro {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; //initial on same line

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        numbers[4] = 7;
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));

        String names[] = {"Hi", "Hello", "Besant"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);


        int age[] = new int[4];  // size
        age[0] = 34;
        age[1] = 67;
        age[2] = 56;

        System.out.println(Arrays.toString(age));
        // age[4] = 100;

        // First largest number in array
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println(max + " is the largest number in array");

        int[] arr = {12, 35, 1, 10, 34, 2};
       // System.out.println(getSecondLargest(arr));

        int n = arr.length;

        // Sort the array in non-decreasing order
        Arrays.sort(arr);

        System.out.println("The second largest number is " +arr[n-2]);

        System.out.println("The smallest number is " +arr[0]);


    }
}
