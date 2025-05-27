package com.arithmeticoperations;

public class arithmeticoperator
{
    public static void main(String[] args){
        int num1 = 520;
        int num2 = 50;
        int num3 = 300;

        //add
        int addresult= num1+num2+num3;
        System.out.println("Addition result " +addresult);
        //sub
        int subresult= num1-num2-num3;
        System.out.println("Subtraction result " + subresult );
        //multiplication
        System.out.println("Multiplication result " + num1*num2*num3);
        //division
        System.out.println("Division result " + num1/num2);
        //modulo
        System.out.println("Modulo result " + num1%num2);

    }

}
