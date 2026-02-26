package com.calculator.calculadora;
import com.calculator.list.DoublyLinkedList;
import com.calculator.list.SinglyLinkedList;

import com.calculator.list.InterfList;

public class ListFactory {

    public static <T> InterfList<T> createList(String type) {

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