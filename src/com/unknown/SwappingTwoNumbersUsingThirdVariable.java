package com.unknown;

public class SwappingTwoNumbersUsingThirdVariable {

    public static void main(String[] args) {
        int a=20,b=10, c;
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("a=" +a + " " + "b=" +b);

    }
}
