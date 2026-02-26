package com.calculator.list;

public interface InterfList<T> {

    void addLast(T value);
    T getLast();
    T removeLast();
    int size();
    boolean isEmpty();
}