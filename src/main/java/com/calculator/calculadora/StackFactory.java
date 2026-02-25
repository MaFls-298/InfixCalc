package com.calculator.calculadora;

import java.util.Stack;

import com.calculator.list.*;
import com.calculator.stack.*;

public class StackFactory {
    /*public static <T> Stack<T> createStack(String tipoStack, String tipoLista) {

        switch (tipoStack.toLowerCase()) {

            case "arraylist":
                return new ArrayListStack<>();

            case "vector":
                return new VectorStack<>();

            case "lista":
                Lista<T> lista;

                if (tipoLista.equalsIgnoreCase("simple")) {
                    lista = new SimpleLinkedList<>();
                } else {
                    lista = new DoubleLinkedList<>();
                }

                return new ListStack<>(lista);

            default:
                throw new IllegalArgumentException("Tipo de stack inválido");
        }
    }*/
}
