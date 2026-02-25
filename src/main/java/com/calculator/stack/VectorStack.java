package com.calculator.stack;
import java.util.Vector;

public class VectorStack<T> extends AbstractStack<T> {
    private final Vector<T> vector;

    public VectorStack() {
        vector = new Vector<>();
    }

    @Override
    public void push(T value) {
        vector.add(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }

        T popvalue = vector.remove(vector.size() - 1);
        return popvalue;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        return vector.lastElement();
    }

    @Override
    public int size() {
        return vector.size();
    }
    
}
