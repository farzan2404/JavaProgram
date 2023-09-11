// package CollectionFramework.Set;

import java.util.*;

public class HashSetLearn {
    public static void main(String[] args) {
        Set<Integer> hasset = new HashSet<>();
        hasset.add(12);
        hasset.add(10);
        hasset.add(52);
        hasset.add(72);
        hasset.add(43);
        hasset.add(-2);

        System.out.println(hasset);

        // hasset.remove(10);

        System.out.println(hasset);

        System.out.println(hasset.contains(100));

        System.out.println(hasset.isEmpty());

        System.out.println(hasset.size());

        hasset.clear();

        System.out.println(hasset);
    }
}
// Hashset stores values on the basis of hash code generated for item inserted
// in the memory. If we want to retrieve that value from the memory, we need to
// compute the hash code of the value and get it.