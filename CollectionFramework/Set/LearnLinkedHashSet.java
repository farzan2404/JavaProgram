// package CollectionFramework.Set;

import java.util.*;
import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> hasset = new LinkedHashSet<>();
        hasset.add(12);
        hasset.add(10);
        hasset.add(2);
        hasset.add(72);
        hasset.add(3);

        System.out.println(hasset);

        hasset.remove(10);

        System.out.println(hasset);

        System.out.println(hasset.contains(100));

        System.out.println(hasset.isEmpty());

        System.out.println(hasset.size());

        hasset.clear();

        System.out.println(hasset);
    }
}
