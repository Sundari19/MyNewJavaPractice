package com.casting;

public class ExplicitCasting {
    public static void main(String[] args){
        int number1 = 455;
        byte number2 = (byte) number1;
        System.out.println("Number converted from int to byte " +number2);

        double number3 = 122334.53435343;
        float number4 = (float)number3;
        System.out.println("Number converted from double to float " +number4);

        long number5 = 3743743984938L;
        int number6 = (int) number5;
        System.out.println("Number converted from long to int " +number6);




    }
}
