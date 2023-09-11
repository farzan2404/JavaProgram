// package CollectionFramework.Map;

import java.util.*;

public class LearnMapWithHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);
        numbers.put("Nine", 9);
        numbers.put("Six", 6);
        numbers.put("Six", 5);
        numbers.put("Six", 11);

        // if (!numbers.containsKey("Two")) {
        // numbers.put("Two", 23);
        // }

        numbers.putIfAbsent("Two", 24);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            // System.out.println(e);
            System.out.print(e.getKey() + "" + e.getValue() + " ");
        }

        // for (String key : numbers.keySet()) {
        // System.out.println(key);
        // }

        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        // Check number present or Not.
        System.out.println(numbers.containsValue(24));

        System.out.println(numbers.isEmpty());
    }
}
