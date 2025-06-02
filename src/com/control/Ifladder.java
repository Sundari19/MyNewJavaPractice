package com.control;

import java.util.Scanner;

public class Ifladder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        double perTicketCost = 100;
        double cost;

        if(age<7){
            cost= perTicketCost - (.10*perTicketCost);
            System.out.println("You will get 10% discount " + name);

        }
        else if(age >=7 && age< 20){
            cost= perTicketCost - (.15*perTicketCost);
            System.out.println("You will get 15% discount " + name);

        }
        else if(age >=20 && age< 40){
            cost= perTicketCost - (.20*perTicketCost);
            System.out.println("You will get 20% discount " + name);

        }
        else {
            cost= perTicketCost - (.25*perTicketCost);
            System.out.println("You will get 25% discount " + name);

        }
        System.out.println("Amount you have to pay is " + cost);
    }
}