package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {


        /* nested if is 1 is statement inside another if statement

        when we have one condition that depends on another

         */

        boolean vaccine = true;
        int dose = 2;

        if (vaccine) {  //outer if
            System.out.println("How many doses you have?");
            // inner if always depend on outer if
            if (dose == 1) {
                System.out.println("you need a second shot");
            } else {     //this else is related to if
                System.out.println("you are fully vaccinated");
            }

        } else {    // we can use it if the result is false
            System.out.println("I do not have a vaccine");
        }
    }
}
