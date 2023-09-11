// package CollectionFramework.List;

import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        numbers.add(21);
        numbers.add(22);
        numbers.add(24);
        numbers.add(25);
        numbers.add(11);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);

        strings.add("Tom");
        strings.add("Harry");
        strings.add("Max");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
        Collections.sort(strings, Comparator.reverseOrder());
        System.out.println(strings);

        System.out.println("Min elements is " + Collections.min(numbers));
        System.out.println("Max elements is " + Collections.max(numbers));
        System.out.println("no. of times element repeated " + Collections.frequency(numbers, 10));

        Collections.sort(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);
    }
}