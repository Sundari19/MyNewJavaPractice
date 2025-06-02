package com.control;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter month number");
        int mark= scan.nextInt();
        switch(mark){
            case 1:
                System.out.println("This is January month");
                break;
            case 2:
                System.out.println("This is february month");
                break;
            case 3:
                System.out.println("This is march month");
                break;
            case 4:
                System.out.println("This is april month");
                break;
            case 5:
                System.out.println("This is may month");
                break;
            case 6:
                System.out.println("This is june month");
                break;
            case 7:
                System.out.println("This is july month");
                break;
            case 8:
                System.out.println("This is august month");
                break;
            case 9:
                System.out.println("This is september month");
                break;
            case 10:
                System.out.println("This is october month");
                break;
            case 11:
                System.out.println("This is november month");
                break;
            case 12:
                System.out.println("This is december month");
                break;
            default:
                System.out.println("Enter the correct number");

        }
    }
}
