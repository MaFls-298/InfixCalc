package com.calculator.calculadora;

public abstract class AbstractList<T> implements List<T> {

    protected int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}