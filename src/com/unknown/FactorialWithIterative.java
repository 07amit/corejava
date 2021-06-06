package com.unknown;

public class FactorialWithIterative {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of number is =" +factorial(0));

    }

}
