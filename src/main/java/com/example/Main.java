package com.example;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello("Pelle");

        Greeting greeting2 = (a) -> System.out.println(a);
        greeting2.sayHello("Janne");

        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.add(5, 3));

        IntBinaryOperator intBinaryOperator = (a, b) -> {
            return  a + b;
        };
        System.out.println(intBinaryOperator.applyAsInt(5, 3));

        Function<Integer, Integer> function = x -> x * 2;
        System.out.println(function.apply(5));
    }
}
