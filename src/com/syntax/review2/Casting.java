package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {


        /* casting - convert 1 datatype into another
        1. widening/implicit/automatic
        Example: (byte->short->int->long->float->double)
        2. narrowing/explicit/manual
        Example (double->float->long->int->short->byte)
         */

        //widening
        double d=5;     // we used double instead of int
        System.out.println(d);  // result will be 5.0

       //narrowing
       int i= (int)5.0;     // we used int with double number
        System.out.println(i);   // result will be 5


        int num=128;
        byte b=(byte)num;    // if we tried to fit more than 127 in byte
        System.out.println(b);   // result will be -128

    }
}
