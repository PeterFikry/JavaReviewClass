package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more conditions to test

        if(boolean condition){
               code A;
          }else if (boolean condition) {
              code B;
          }else if (boolean condition) {
              code C;
          }

         */

        /* Check homework
        if you completed more than >25 assignments -> great job
        if you completed more than >20 assignments -> good job
        if you completed more than >10 assignments -> ok job
        if you completed more than >5 assignments -> not good job
         */

        int num = 6;
        if (num > 25) {
            System.out.println("great job");
        } else if (num > 20) {
            System.out.println("good job");

        } else if (num > 10) {
            System.out.println("ok job");

        } else if (num > 5) {
            System.out.println("not good job");
        }

        System.out.println("-------------------------------------------------");

        String browser = "opera";

        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");

        } else { //when non of the conditions are true , code comes to else block
            System.out.println("browser is not supported");

        }


    }
}

