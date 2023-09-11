// package CollectionFramework.List;

import java.util.*;

public class LoopsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);

        // Normal for loop in ArrayList.

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("The element is " + numbers.get(i));
        }

        // System.out.println(numbers);

        // for every element in numbers(ArrayList), we do
        for (Integer element : numbers) {
            System.out.println(" The element is: " + element * 2);
        }

        // Iterator function in for loop, where "it" is an iterator which loops through
        // the entire list.
        // Then to obtain the functionality of iterator we put iterator() function to
        // the list.

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(" Iterator has the next value: " + it.next());
        }
    }
}
