package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        /*
        Using scanner ask user to enter browser
        based on the browser -> execute code
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you favorite browser");
        String browser = scanner.nextLine();

        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Test case executed in " + browser);
                break;
            case "firefox":
                System.out.println("Test case executed in " + browser);
                break;
            case "safari":
                System.out.println("Test case executed in " + browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");
        }
    }
}
