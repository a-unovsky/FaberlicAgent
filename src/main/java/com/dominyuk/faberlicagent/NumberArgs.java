package com.dominyuk.faberlicagent;


import java.util.*;

public class NumberArgs {
	List<String> list;
	
    public static void main(String[] args) {
        NumberArgs n = new NumberArgs(Arrays.asList(args));
        n.printAll();
        n.printEaven();
        n.printSum();
    }

    public NumberArgs(List<String> list) {
    	this.list = list;
    }

    public void printEaven() {
        boolean isEaven = false;
        System.out.println("\nEvery second argument:");
        for (String a : list) {
            if (isEaven) {
                System.out.print(a + " ");
            }
            isEaven = !isEaven;
        }
//        for (int i = 0; i < list.size(); i++) {
//        	if (/* is i even? */) {
//        		
//        	}
//        }
    }

    public void printAll() {
        System.out.println("There are all argumets:");
        for (String a : list) {
            System.out.print(a + " ");
        }
    }

	public void printSum() {
		List<Integer> intList = new ArrayList<Integer>();
		for (String s : list)
			intList.add(Integer.valueOf(s));
		int sum = 0;
		System.out.println("\nThe sum of all argumets:");
		for (int a : intList)
			sum = sum + a;
		System.out.println(sum);
	}
}
