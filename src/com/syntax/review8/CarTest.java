package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "X7");
        bmw.start();
        System.out.println( bmw.drive("Smooth"));
        bmw.brake();    //comes from BMW which is subclassed

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S",2022,350,"Electric",true);
        tesla.start();      //override method from Tesla class is executed
        tesla.drive(75);    //comes from Parent class
        tesla.haveAutoPilot();  //comes from Tesla class

        //Runtime polymorphism achieved through method overriding
        //Casting : widening and narrowing - use with primitives
        //   UpCasting and DownCasting - use with non primitives
        Car bmw1=new BMW("BMW","X9");   //upcasting
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive("Miami",120);

    }
}
