package com.calculator.list;

public interface InterfList<T> {
    void add(T value);
    T get();
    T remove();
    int size();
    boolean isEmpty();
}
