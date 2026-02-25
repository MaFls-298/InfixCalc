package com.calculator.stack;

public abstract class AbstractStack<T> implements InterfStack<T> {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    
}
