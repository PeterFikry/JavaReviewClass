package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {
        //can I create an object of Insurance class - No, since it is abstract
        Insurance carPolicy = new CarPolicy("I0903", "John Smith", 200, 22);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P029308", "Olena", 150, 4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances = {
                new CarPolicy("I0903", "John Smith", 200, 22),
                new CarPolicy("I0903", "John Smith", 200, 22),
                new PetPolicy("P029308", "Olena", 150, 4),
                new CarPolicy("I0903", "John Smith", 200, 22),
        };
        insurances[0].calculateCoverage();
    }
}
