package com.variable;

public class StaticVariable {

    static public long collegePin = 678042;
    static public String collegeName = "Government college Chennai";

    public static void main(String[] args){

        System.out.println("College Pincode is " +StaticVariable.collegePin);
        System.out.println("College name is " +StaticVariable.collegeName);

    }
}
