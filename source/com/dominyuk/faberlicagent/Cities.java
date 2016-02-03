package com.dominyuk.faberlicagent;

import java.util.*;

public class Cities {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String a : args) {
            Integer km = new HelloWorld().readInputAsInteger("How Far is " + a + " (km): ");
            m.put(a, km);
        }
        Integer min = Collections.min(m.values());
        System.out.println("The nearest city/cities is/are:");
        for (Map.Entry<String, Integer> e : m.entrySet())
            if (e.getValue() == min)
        System.out.println(e.getKey());
    }
}
