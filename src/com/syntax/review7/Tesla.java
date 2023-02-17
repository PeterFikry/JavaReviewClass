package com.syntax.review7;

//Tesla is a subclass of a Car class
//Car is a super class of Tesla class
public class Tesla extends Car {

    String type;
    boolean autoPilot;

    public Tesla(String make, String model, int year, int horsePower, String type, boolean autoPilot) {
        super(make, model, year, horsePower);
        this.type = type;
        this.autoPilot = autoPilot;
    }

    public void haveAutoPilot() {
        System.out.println(make + " have auto pilot " + autoPilot);
    }
    @Override
    public void start() {
        System.out.println(make+" starts automatically");
    }
    //overriding - is when we have same method in 2 different class (Parent - child)
    //In overriding -inheritance is must
    //In overriding methods signature should be same
}