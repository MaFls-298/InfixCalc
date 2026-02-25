package com.calculator.list;

public abstract class AbstractList<T> implements InterfList<T> {

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    
}
