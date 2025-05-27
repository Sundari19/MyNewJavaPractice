package com.variable;

public class Variable {

    public String bookName = "Wings of Fire";
    public String authorName = "Abdul Kalam";
    static public String libraryName = "Anna Library";

    public static void main(String[] args)
    {
    Variable obj = new Variable();
        System.out.println(obj.bookName);
        System.out.println(obj.authorName);
        System.out.println(libraryName);
    }
}


