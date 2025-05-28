package com.casting;

public class ImplicitCasting {
    public static void main(String[] args){
        byte number1 = 56;
        int number2 = number1;
        System.out.println("Number to be converted " +number1);
        System.out.println( "Number converted from byte to int " +number2);

        int number3 = 234;
        long number4 = number3;
        System.out.println("Int number to be converted " +number3);
        System.out.println("Number to be converted from int to long " +number4);

        float number5 = 23.343F;
        double number6= number5;
        System.out.println("Float number to be converted " +number5);
        System.out.println("Number to be converted from float to double " +number6);

    }
}
