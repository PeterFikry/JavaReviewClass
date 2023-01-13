package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {

        /*if statement

        if (boolean condition) {
                 code A;
         }else {
                 code B

         */

        int num = 150;
        if (num > 100) {
            System.out.println(num + " is greater than a 100");
        } else {
            System.out.println(num + " is less than a 100");

        }


        String button = "Enroll today";          //we enter today instead of Today

        if (button.equals("Enroll Today")) {
            System.out.println("Test Case Passed");
        } else {
            System.out.println("Test Case Failed");   //That's why it's failed
        }
    }
}
