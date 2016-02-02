// package com.dominyuk.faberlicagent;


import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        // InputReader prompt = new InputReader();
        InputReader prompt = new InputReader();
        // int number1 = prompt.getUserInput("Введіть перше ціле число");
        String input1 = prompt.getUserInput("Enter first number");
        int number1 = Integer.valueOf(input1);
        // int number2 = prompt.getUserInput("Введіть друге ціле число");
        String input2 = prompt.getUserInput("Enter second number");
        int number2 = Intager.valueOf(input2);
        int sum = number1 + number2;
//        System.out.println("sum of " + number1 + " + " + number2 + " is " + sum");
        System.out.println(number1);
    }

}
