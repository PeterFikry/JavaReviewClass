package com.syntax.review4;

public class ForLoop {
    public static void main(String[] args) {

        //best loop - used when we know how many times we want to repeat block of code

        for (int i = 2; i < +20; i += 5) {

            System.out.println(i);
        }

        System.out.println("-----------------");

        // we can use break and continue with for loop

        for (int i = 2; i < +20; i += 5) {

            System.out.println(i);

            if (i == 12) {
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;       // stops/break the loop
            }
        }

        System.out.println("-------------------");


        //continue - skips current iteration

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
                continue;       //Java goes back to the beginning of the loop and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
            System.out.println("How are you?");
            System.out.println("Hope you well");
        }
    }
}
