package com.syntax.review6;

public class Flower {

    static boolean pretty = true;

    //attributes صفات, properties   الخصائص

    //below are local variables
    String color, name;
    int price;

    //behavior  سلوك

    //below are methods
    void smell() {
        System.out.println(name + " smells good");
    }

    void bloom() {
        System.out.println(name + " flower blooms");
    }

    void grow() {
        System.out.println(name + " flower grow");


    }
}
