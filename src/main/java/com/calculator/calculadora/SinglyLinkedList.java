package com.calculator.calculadora;

public class SinglyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addLast(T value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public T removeLast() {

        if (isEmpty()) {
            throw new RuntimeException("lista vacia");
        }

        if (head.next == null) {
            T data = head.data;
            head = null;
            size--;
            return data;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        T data = current.next.data;
        current.next = null;
        size--;

        return data;
    }

    public T getLast() {

        if (isEmpty()) {
            throw new RuntimeException("lista vacia");
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }
}