package com.syntax.review7;

public class OverLoading {
    private void hello() {
        System.out.println("Hello");
    }

    private void hello(String name) {
        System.out.println("Hello "+name);
    }

    static void bye(){
        System.out.println("Bye");
    }
    static void bye(String name){
        System.out.println("Bye "+name);
    }
}


