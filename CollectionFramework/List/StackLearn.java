// package CollectionFramework.List;

import java.util.*;

public class StackLearn {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Deer");
        animals.push("Giraffe");
        System.out.println("Stack:" + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack:" + animals);
        System.out.println(animals.push("Elephant"));
        System.out.println(animals);

    }
}
