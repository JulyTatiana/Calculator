package com.example.Calculator;

import java.util.Scanner;

public class Calculator {
    private static int valueA;
    private static int valueB;
    private static String operator;
    private static char operatorA;

    public int getValueA() {
        return valueA;
    }

    public int getValueB() {
        return valueB;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter problem.");


        valueA = keyboard.nextInt();
        valueB = keyboard.nextInt();
        operator = keyboard.next();
        operatorA = operator.charAt(0);

        int add =  '+' ;
        int minus = '-';
        int multiply = '*';
        int divide = '/';

        switch (operatorA) {
            case '+':
                add=valueA + valueB;
                System.out.println(add);
                break;

            case '-':
                minus = valueA - valueB;
                System.out.println(minus);
                break;

            case '*':
                multiply=valueA * valueB;
                System.out.println(multiply);
                break;

            case '/':
                divide=valueA / valueB;
                System.out.println(divide);
                break;

            default:
                System.out.println("unknown operator '" + operator + "'. Please try again.");
                break;
        }

    }

}
