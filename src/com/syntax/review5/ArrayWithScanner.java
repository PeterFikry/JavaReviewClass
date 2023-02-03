package com.syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {

        //Let's create an array of names using Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size = scanner.nextInt();
        String[] name = new String[size];

        for (int i = 0; i < name.length; i++) {

            System.out.println("Please enter name");
            name[i] = scanner.next();
        }
       //using loop below we can retrieve element
       //enhanced for loop work with variable
        for (String n:name){
            System.out.println(n);
        }
    }
}
