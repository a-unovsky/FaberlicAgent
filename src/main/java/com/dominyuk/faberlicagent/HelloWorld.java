package com.dominyuk.faberlicagent;

import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld num = new HelloWorld();
        int number1 = num.readInputAsInteger("Enter first number");
        int number2 = num.readInputAsInteger("Enter second number");
        int sum = number1 + number2;
        System.out.println("sum of " + number1 + " + " + number2 + " is " + sum);
    }

    public int readInputAsInteger(String prompt) {
        String input = new InputReader().getUserInput(prompt);
        return Integer.valueOf(input);
    }

}
