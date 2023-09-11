// package CollectionFramework.Map;

import java.util.*;

public class LearnMapWithTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Eleven", 3);
        numbers.put("Seven", 7);
        numbers.put("Three", 3);
        numbers.put("Eight", 8);

        // if (!numbers.containsKey("Two")) {
        // numbers.put("Two", 23);
        // }

        numbers.putIfAbsent("Two", 24);

        numbers.remove("Three");
        System.out.println(numbers);

        // for (Map.Entry<String, Integer> e : numbers.entrySet()) {
        // System.out.println(e);
        // // System.out.println(e.getKey());
        // // System.out.println(e.getValue());
        // }

        // for (String key : numbers.keySet()) {
        // System.out.println(key);
        // }

        // for (Integer value : numbers.values()) {
        // System.out.println(value);
        // }

        // Check number present or Not.
        System.out.println(numbers.containsValue(24));

        System.out.println(numbers.isEmpty());
    }
}
