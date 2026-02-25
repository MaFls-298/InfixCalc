package com.calculator.stack;

public interface InterfStack<T> {
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();

}
