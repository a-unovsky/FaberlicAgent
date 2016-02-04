package com.dominyuk.faberlicagent;

import java.util.*;

/**
II CitiesUtility
Read citites name as program args:
java CitiesUtilities Kyiv Lviv Donetsk
How Far is Kyiv (km):
How FAr Is Lviv (km):
…
The nearest city is: ….
*/
public class Cities {
	/**
	 * TODO:
	 * if program is run without params it should print:
	 * run <ProgramName> city1
	 */
	/*
	 * Doesn't work:
How Far is Lviv (km):   1000
How Far is Kyiv (km):   500
How Far is Donetsk (km):   500
The nearest city/cities is/are:
Kyiv
 
	 */
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String a : args) {
            Integer km = new HelloWorld().readInputAsInteger("How Far is " + a + " (km): ");
            m.put(a, km);
        }
        Integer min = Collections.min(m.values());
        System.out.println("The nearest city/cities is/are:");
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            if (e.getValue() == min)
            	System.out.println(e.getKey());
        }
    }
}
