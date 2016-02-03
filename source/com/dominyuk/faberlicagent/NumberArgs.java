package com.dominyuk.faberlicagent;


import java.util.*;

public class NumberArgs {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        NumberArgs n = new NumberArgs();
        n.printAll(list);
        n.printEaven(list);
        n.printSum(list);
    }


    public void printEaven(List<String> list) {
        boolean isEaven = false;
        System.out.println("\nEvery second argument:");
        for (String a : list) {
            if (isEaven)
                System.out.print(a + " ");
            isEaven = !isEaven;
        }
    }

    public void printAll(List<String> list) {
        System.out.println("There are all argumets:");
        for (String a : list)
                System.out.print(a + " ");
    }

    public void printSum(List<String> list) {
        List<Integer> intList = new ArrayList<Integer>();
        for (String s : list) intList.add(Integer.valueOf(s));
        int sum = 0;
        System.out.println("\nThe sum of all argumets:");
        for (int a : intList)
            sum = sum + a;
        System.out.println(sum);
    }
}
