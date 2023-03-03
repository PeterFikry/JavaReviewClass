package com.syntax.review10;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        //set is a collection of unique elements (No duplicate elements)
        Set<String> qaJobs = new HashSet<>(); //does not maintain the order
        //adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Remove an element "+qaJobs);
        qaJobs.add("API Tester");
        qaJobs.add("API Tester");

        System.out.println("Added duplicates " + qaJobs);

        //creating an object and passing collection as a parameter to invoke parameterized constructor
        Set<String> lset = new LinkedHashSet<>(qaJobs);   //maintains the insertion order

        System.out.println("LinkedHashset =" + lset);

        Set<String> tSet = new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet ="+tSet);


    }
}
