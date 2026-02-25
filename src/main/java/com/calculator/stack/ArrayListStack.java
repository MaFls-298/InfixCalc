package com.calculator.stack;
import java.util.ArrayList;

public class ArrayListStack<T> extends AbstractStack<T> {
    private final ArrayList<T> list;

    public ArrayListStack() {
        list = new ArrayList<>();
    }

    @Override
    public void push(T value) {
        list.add(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }

        T value = list.remove(list.size() - 1);
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}