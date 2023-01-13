package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = true;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed");
        }

        System.out.println("-------------- Logical OR ---------------");

        boolean dashBoard = true;
        String message = "Welcome admin";

        if (dashBoard || message.equals("Welcome admin")) {
            System.out.println("User is successfully logged in");
        } else {
            System.out.println("User is not logged in");
        }


        System.out.println("-------------- Logical NOT -----------------");

        boolean b = true;

        System.out.println(!true);          //false

        boolean agreeCheckBoxSelected = false;

        if (!agreeCheckBoxSelected) {
            System.out.println("I am clicking on checkbox");
        }

        System.out.println("I am clicking on submit button");


    }
}
