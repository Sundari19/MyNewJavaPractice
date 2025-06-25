package com.arrray;

import java.util.Arrays;

public class Arrray_Methods {

    public static void main(String[] args){
        int[] num = {10,5,45,8,90,67,32};
        Arrays.sort(num);
        System.out.println("Sort Number " + Arrays.toString(num));


        String[] names = {"Besant" ,"Sowndharya"  ,"java" , "online" , "Class","Bala", "Vignesh"};
        Arrays.sort(names);
        System.out.println("Sort String " + Arrays.toString(names));

        //Binary search
        int[] arr = {10,5,45,8,90,67,32,64};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Binary Search " +Arrays.toString(arr));
        System.out.println("Index " +index);

        //fill
        int[] arr1 = new int [4];
        Arrays.fill(arr1, 10) ;
        System.out.println("Fill " +Arrays.toString(arr1));

       //equals
        int[] arr2 = {10,5,45,8,90,67,32};
        int[] arr3 = {67,5,90,10,32,45,8};
        System.out.println("Equals " +Arrays.equals(arr2,arr3));

        //copyOf
        int[] arr4 = {1,2,3,4,5} ;
        int[] arr5 = Arrays.copyOf(arr4, 8);
        System.out.println("CopyOf " +Arrays.toString(arr5));

        //copyOfRange
        int[] arr6 = {4,7,6,2,9,9,76,45,68};
        int[] arr7 = Arrays.copyOfRange(arr6, 2, 7);
        System.out.println("Copy of range " +Arrays.toString(arr7));

        System.out.println("Compare " + Arrays.compare(arr6, arr4));
        System.out.println("Compare " + Arrays.compare(arr7, arr6));
    }
}
