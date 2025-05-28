package com.control;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your mark");
        int mark= scan.nextInt();

        if(mark>90){
            System.out.println("You have scored first class " + name);
        }
        else if(mark>80 && mark <= 90){
            System.out.println("You have scored second class " + name);
        }
        else if(mark>70 && mark <= 80){
            System.out.println("You have scored third class " + name);
        }
        else if(mark>60 && mark <= 70){
            System.out.println("You have scored fourth class " + name);
        }
        else{
            if(mark>50){
                System.out.println("You have failed and scored first level failure " + name);
            }
            else if(mark>40 && mark <= 50){
                System.out.println("You have failed and scored second level failure " + name);
            }
            else if(mark>30 && mark <= 40){
                System.out.println("You have failed and scored third level failure " + name);
            }
            else if(mark>20 && mark <= 30){
                System.out.println("You have failed and scored fourth level failure " + name);
            }
            else{
                System.out.println("You have failed and scored fifth level failure " + name);
            }
        }

    }
}
