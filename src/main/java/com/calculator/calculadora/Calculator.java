package com.calculator.calculadora;
import java.util.Stack;
public class Calculator {

    private static Calculator instance;

    private Calculator() {
    }

    public static Calculator getInstance() {

        if (instance == null) {
            instance = new Calculator();
        }

        return instance;
    }


    public String infixToPostfix(String expression, Stack<String> stack) {

        StringBuilder result = new StringBuilder();
        String[] tokens = expression.split(" ");

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.matches("\\d+")) {
                result.append(token).append(" ");
            }

            else if (token.equals("(")) {
                stack.push(token);
            }

            else if (token.equals(")")) {

                while (!stack.peek().equals("(")) {
                    result.append(stack.pop()).append(" ");
                }

                stack.pop();
            }

            else {

                while (!stack.isEmpty() &&
                        precedence(token) <= precedence(stack.peek())) {

                    result.append(stack.pop()).append(" ");
                }

                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }


    public double evaluatePostfix(String expression, Stack<Double> stack) {

        String[] tokens = expression.split(" ");

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            } else {

                double b = stack.pop();
                double a = stack.pop();

                if (token.equals("+")) {
                    stack.push(a + b);
                }
                else if (token.equals("-")) {
                    stack.push(a - b);
                }
                else if (token.equals("*")) {
                    stack.push(a * b);
                }
                else if (token.equals("/")) {
                    stack.push(a / b);
                }
            }
        }

        return stack.pop();
    }

    private int precedence(String operator) {

        if (operator.equals("+") || operator.equals("-")) {
            return 1;
        }
        else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        else {
            return 0;
        }
    }
}