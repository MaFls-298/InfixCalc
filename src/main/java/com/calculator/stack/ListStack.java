package com.calculator.stack;

import com.calculator.list.InterfList;

public class ListStack<T> extends AbstractStack<T> {

    private InterfList<T> list;

    public ListStack(InterfList<T> list) {
        this.list = list;
    }

    @Override
    public void push(T value) {
        list.addLast(value);
    }

    @Override
    public T pop() {
        return list.removeLast();
    }

    @Override
    public T peek() {
        return list.getLast();
    }

    @Override
    public int size() {
        return list.size();
    }
}
