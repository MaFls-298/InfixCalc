package com.calculator.calculadora;

import java.util.Stack;

import com.calculator.list.*;
import com.calculator.stack.*;

public class StackFactory {
    public static <T> InterfStack<T> createStack(String tipoStack, String tipoLista) {

        switch (tipoStack.toLowerCase()) {

            case "arraylist":
                return new ArrayListStack<T>();

            case "vector":
                return new VectorStack<T>();

            case "lista":
                InterfList<T> lista;

                if (tipoLista != null && tipoLista.equalsIgnoreCase("simple")) {
                    lista = new SinglyLinkedList<T>();
                } else {
                    lista = new DoublyLinkedList<T>();
                }

                return new ListStack<T>(lista);

            default:
                throw new IllegalArgumentException("Invalido");
        }
    }
}
