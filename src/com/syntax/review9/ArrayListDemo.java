package com.syntax.review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //The Integer class wraps a value of the primitive type int in an object
        ArrayList<Integer> aList = new ArrayList<>();
        //to store values inside an arrayList
        aList.add(12);
        aList.add(13);
        aList.add(14);

        //how to find size of my arrayList
        int size = aList.size();
        System.out.println("The size of alist is = " + size);

        //to access
        int firstElement = aList.get(0);
        System.out.println(firstElement);   //112
        //replacing value of the 1 element
        aList.set(0, 120);

        firstElement = aList.get(0);
        System.out.println(firstElement);

        //remove elements
        aList.remove(2);
        //print list after the removal
        System.out.println(aList);
    }
}
