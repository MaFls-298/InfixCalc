package com.calculator.calculadora;

import java.util.Scanner;
import java.util.Stack;

import com.calculator.stack.InterfStack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = Calculator.getInstance();

        System.out.println("calculadora");
        System.out.println("tipos de stack como: arraylist, vector, lista");
        System.out.print("ingrese el tipo de stack a usar: ");
        String tipoStack = scanner.nextLine().trim();

        String tipoLista = null;
        if (tipoStack.equalsIgnoreCase("lista")) {
            System.out.println("tipos de lista disponibles: simple, doble");
            System.out.print("ingrese el tipo de lista a usar: ");
            tipoLista = scanner.nextLine().trim();
        }

// ve que tipo de stack se va a usar y crea una instancia de ese stack usando la StackFactory
        InterfStack<String> stackPrueba = StackFactory.createStack(tipoStack, tipoLista);
        System.out.println("Stack creado: " + stackPrueba.getClass().getSimpleName());

        System.out.println("\nIngrese expresiones, porfavor separe cada termino con un espacio");
        System.out.println("por ejemplo: 3 + 5 * ( 2 - 10 ) estan separados por espacios");
        System.out.println("escriba 'salir' para terminar la calculadora");

        while (true) {

            System.out.print("expresion: ");
            String expresion = scanner.nextLine().trim();

            if (expresion.equalsIgnoreCase("salir")) {
                System.out.println("adios... :,(");
                break;
            }

            if (expresion.isEmpty()) {
                System.out.println("expresion vacia ");
                continue;
            }

            Stack<String> stackInfix = new Stack<>();
            String postfix = calculator.infixToPostfix(expresion, stackInfix);

            Stack<Double> stackEval = new Stack<>();
            double resultado = calculator.evaluatePostfix(postfix, stackEval);

            System.out.println("Postfix   : " + postfix);
            System.out.println("Resultado : " + resultado);
            System.out.println();
        }

        scanner.close();
    }
}