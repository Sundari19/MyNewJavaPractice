package com.methodexample;

public class Method_Example {

    public static void main(String[] args){
        System.out.println("This is main method");
        Method_Example obj = new Method_Example();
        obj.exampleInstance();
    }
    public void exampleInstance(){
        otherInstanceMethod();
        System.out.println("This is instance method");
        exampleStatic();
    }

    public static void exampleStatic(){
        System.out.println("This is static method");
        //Method_Example obj1 = new Method_Example();
       // obj1.otherInstanceMethod();
    }

    public  void otherInstanceMethod(){
        System.out.println("This is second instance method");
        exampleStatic();
    }
}
