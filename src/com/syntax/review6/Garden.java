package com.syntax.review6;

public class Garden {

    void hello(){
        String name="Adem";         //local variable
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {

        //static String str;       cannot use static for local variables

        //System.out.println(name);     error since local variable name is not in the same block of code.

        // object : means Flower which is related to main class we have 3 flowers below

        Flower flower1 = new Flower();
        ///accessing variables of Flower class
        System.out.println(Flower.pretty); // we can access static value like this by class name and this is the correct way to access it
        flower1.name = "Hibiscus";
        flower1.color = "red";
        flower1.price = 5;
        flower1.pretty = false;      //not the right way to access static variable, but it's possible.
        System.out.println("Hibiscus are pretty?" + flower1.pretty);
        System.out.println(flower1.price);
        //flower1.size; error since variables size does not exist in flower class

        //accessing methods of Flower class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the flower class");
        Flower flower2 = new Flower();
        System.out.println("Roses are pretty?" + flower2.pretty);
        flower2.name = "Rose";
        flower2.color = "blue";
        flower2.price = 15;

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        Flower flower3 = new Flower();

        //variable i : is a local to it;s block of code - loop
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        //System.out.println(i);    error - since i is not visible inside of loop {}
    }
}
