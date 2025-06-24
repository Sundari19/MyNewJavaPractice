package com.methodexample;

import com.methodexample.Method_Calling;

import static com.methodexample.Method_Example.exampleStatic;

public class Method_Calling {

    public void examples() {
        Method_Example obj3 = new Method_Example();
        System.out.println("This is calling class");
        obj3.otherInstanceMethod();
        exampleStatic();
    }
}
