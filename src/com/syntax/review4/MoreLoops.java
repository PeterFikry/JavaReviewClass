package com.syntax.review4;

public class MoreLoops {
    public static void main(String[] args) {

        //what is the output?
        for (int i = 0; i <= 3; i++) {

            System.out.println(i);  //0 1 2 3

            for (int j = 0; j >= 3; j++) {

                System.out.println(j);

            }
        }

        System.out.println("--------");

        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }

        System.out.println("----Car Odometer----");

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {

                        System.out.println(i + " " + j + " " + k + " " + l);
                    }

                }
            }

        }
        // HW create a digital clock
        //it should start printing 00:00 and end 23:59 , if we want to make it more complicated we can add secconds

    }
}
