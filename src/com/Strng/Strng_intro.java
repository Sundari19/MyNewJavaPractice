package com.Strng;

public class Strng_intro {

    public static void main(String[] args){

        String name = "Besant";       //string literal     memory - string constant pool
        System.out.println(name);
        String word = "Besant";
        System.out.println(word);

        String names = new String("Besant");  //heap memory
        System.out.println(names);
    }

}
