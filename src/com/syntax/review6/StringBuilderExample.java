package com.syntax.review6;

public class StringBuilderExample {
    public static void main(String[] args) {

        //this class is mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");

        //all changes happen on the same object
        sb.reverse();       //proves that String builder is mutable

        System.out.println(sb);     //olleH

       String str=sb.toString();          //to switch / change it to String  , very good note
        str.toUpperCase();               //proves that String builder is immutable
        System.out.println(str);        //olleH
    }
}