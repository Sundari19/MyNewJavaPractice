package com.control;

import java.util.Scanner;

public class IfClass {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your age");
        byte age= scan.nextByte();
        if(age>18){
            System.out.println("Hi " +name + " You are eligible to vote");
        }
        else{
            System.out.println("Sorry "+name+ " You are not eligible to vote");
        }
        if(age>60){
            System.out.println("Hi " +name + " You are a senior citizen");
        }
        else{
            System.out.println("Sorry "+name+ " You are not a senior citizen");
        }
    }
}
