package com.calculator.calculadora;

import com.calculator.list.InterfList;
import com.calculator.list.SinglyLinkedList;
import com.calculator.list.DoublyLinkedList;
import com.calculator.stack.InterfStack;
import com.calculator.stack.ArrayListStack;
import com.calculator.stack.VectorStack;
import com.calculator.stack.ListStack;

public class StackFactory {

    public static <T> InterfStack<T> createStack(String tipoStack, String tipoLista) {

        if (tipoStack.equalsIgnoreCase("arraylist")) {
            return new ArrayListStack<T>();

        } else if (tipoStack.equalsIgnoreCase("vector")) {
            return new VectorStack<T>();

        } else if (tipoStack.equalsIgnoreCase("lista")) {
            InterfList<T> lista;

            if (tipoLista != null && tipoLista.equalsIgnoreCase("simple")) {
                lista = new SinglyLinkedList<T>();
            } else {
                lista = new DoublyLinkedList<T>();
            }

            return new ListStack<T>(lista);

        } else {
            throw new IllegalArgumentException("Tipo de stack invalido: " + tipoStack);
        }
    }
}