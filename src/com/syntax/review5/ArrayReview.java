package com.syntax.review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a = 10;

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[2]);
        System.out.println("Size of the array =" + arr.length);

        // to get all the value from the array?

        // arr [0];    arr[1];      arr[2];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int num : arr) {                  // another super easy way
            System.out.println(num);
        }

        String[] colors = {"black", "white", "red", "purple", "blue"};
        //anytime we have arrays we can use enhanced for loop

        for (String color : colors) {
            System.out.print(color + " ");


        }
        System.out.println("--------Printing in reverse----------");
        for (int i = colors.length - 1; i >= 0; i--) {

            System.out.print(colors[i] + " ");
        }
    }
}
