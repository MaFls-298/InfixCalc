package com.calculator.list;


public class DoublyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node prev;
        Node next;
        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public void addLast(T value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    @Override
    public T removeLast() {

        if (isEmpty()) {
            throw new RuntimeException("vacia");
        }

        T data = tail.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return data;
    }

    @Override
    public T getLast() {

        if (isEmpty()) {
            throw new RuntimeException("vacio");
        }

        return tail.data;
    }
}