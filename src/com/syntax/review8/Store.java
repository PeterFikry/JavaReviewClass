package com.syntax.review8;

public class Store {
    public static void main(String[] args) {

        Furniture table=new Table();
        table.assemble();
        table.comfort();    //runtime polymorphism

        Table table1=new Table();
        table1.assemble();
        table1.buildTable("Wood");
        table1.comfort();

        Chair.breaks();
        Furniture.breaks();     //static method called by using class name

        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort();    //runtime polymorphism
        //proof that method breaks is not overridden
        chair.breaks();     //since we are not overriding methods breaks will be executed from Parent
                            //this is also not the right way to call static method
    }
}
