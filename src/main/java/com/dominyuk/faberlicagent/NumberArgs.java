package com.dominyuk.faberlicagent;


import java.util.*;
/**
 * TODO:
 * Read elements from arguments into Collection
java MainClass a b c d … z
-> put them into collection (choose proper implementation)
Print them out
Print every 2nd element
print sum of all elements

 */
public class NumberArgs {
	interface NumberHandler {
		void setNumbers(List<String> numbers);
		void printEaven();
        void printEven();
        void printSum();
        void printAll();
	}
	public static class StreamNumberHandler /* implements NumberHandler */ {
		// TODO
	}
	public static class ForNumberHandler /* implements NumberHandler */ {
		// TODO
//      for (int i = 0; i < list.size(); i++) {
//    	if (/* is i even? */) {
//    		
//    	}
//    }
	}
	public static class ForEachNumberHandler /* implements NumberHandler */ {
		// TODO
	}
	public static class IteratorNumberHandler /* implements NumberHandler */ {
		// TODO
	}

	List<String> list;
	
   
	private static void handleNumbers(NumberHandler handler, String[] numbers) {
//    	 NumberHandler handler = new NumberArgs(Arrays.asList(args));
//		handler.setNumbers(numbers); // TODO fix it
        handler.printAll();
        handler.printEven();
        handler.printSum();
	}

	public static void main(String[] args) {
//    	handleNumber(args, new ForEachNumberHandler());
    	// ...
    }

    public NumberArgs(List<String> list) {
    	this.list = list;
    }

    @Deprecated
    public void printEven() {
        boolean isEaven = false;
        System.out.println("\nEvery second argument:");
        for (String a : list) {
            if (isEaven) {
                System.out.print(a + " ");
            }
            isEaven = !isEaven;
        }

    }

    @Deprecated
    public void printAll() {
        System.out.println("There are all argumets:");
        for (String a : list) {
            System.out.print(a + " ");
        }
    }

    @Deprecated // Use NumberHandler.printSum() instead
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
