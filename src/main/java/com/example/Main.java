package com.example;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = () -> System.out.println("Hello");
        greeting2.sayHello();

        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.add(5, 3));
    }
}
