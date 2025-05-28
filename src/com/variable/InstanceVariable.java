package com.variable;

public class InstanceVariable {

    public String bookName = "Wings of Fire";
    public String authorName = "Abdul Kalam";
    static public String libraryName = "Anna Library";

    public static void main(String[] args)
    {
    InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.bookName);
        System.out.println(obj.authorName);
        System.out.println(libraryName);
    }
}


