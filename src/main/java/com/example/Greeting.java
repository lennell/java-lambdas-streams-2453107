package com.example;

@FunctionalInterface
public interface Greeting<T> {
    void sayHello(T t);
}
