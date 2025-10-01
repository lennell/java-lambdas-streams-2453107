package com.example;

public class HelloGreeting implements Greeting {


    @Override
    public void sayHello(Object o) {
        System.out.println("Hello " + o);
    }
}
