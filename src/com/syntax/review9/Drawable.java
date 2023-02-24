package com.syntax.review9;

//collection of public static final variables and public abstract methods
public interface Drawable {

    String TOOL = "Pencil";     //by default it is : public static final

    void draw();            //by default this method is public abstract

    //above is how Interface used to be before Java 8
    //after Java 8 static and default method were added to the Interface

    default void print() {
        System.out.println("We are drawing object using " + TOOL);
    }

    static void erase() {
        System.out.println("All drawings are erasable");
    }
}

abstract class Shape {
    String color;
    double width, lenght;

    Shape(String color, double width, double lenght) {
        this.color = color;
        this.width = width;
        this.lenght = lenght;
    }

    public abstract double calculateArea();
}

class Rectangle extends Shape implements Drawable {
    Rectangle(String color, double width, double lenght) {
        super(color, width, lenght);
    }

    @Override
    public double calculateArea() {
        return lenght * width;
    }

    @Override
    public void draw() {
        System.out.println("I am drawing rectangle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("I am drawing Square");
    }
}