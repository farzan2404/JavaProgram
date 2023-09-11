import java.util.*;

public class New_Array {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // Adding an element.

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        numbers.add(0, 50);
        System.out.println(numbers); // Add the values.

        // if we want to add a list into another list, we do:

        List<Integer> newList = new ArrayList();
        newList.add(140);
        newList.add(150);

        numbers.addAll(newList);
        System.out.println(numbers);

        // Retrieve an element.

        System.out.println(numbers.get(5));

        // Remove an element through an index.

        System.out.println(numbers.remove(4));
        System.out.println(numbers);

        // Remove an element through its value.

        numbers.remove(Integer.valueOf(150));
        System.out.println(numbers);

        // numbers.clear();
        // System.out.println(numbers);

        // Set a particular value at specific location.

        numbers.set(2, 1000);
        System.out.println(numbers);

        System.out.println(numbers.contains(1000));

    }
}
