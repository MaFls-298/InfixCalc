package com.calculator.calculadora;

public class ListFactory {

    public static <T> List<T> createList(String type) {

        if (type.equalsIgnoreCase("simple")) {
            return new SinglyLinkedList<T>();
        } 
        
        else if (type.equalsIgnoreCase("doble")) {
            return new DoublyLinkedList<T>();
        } 
        
        else {
            throw new IllegalArgumentException("tipo de lista invalido");
        }
    }
}