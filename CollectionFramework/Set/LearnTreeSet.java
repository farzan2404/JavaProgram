// package CollectionFramework.Set;

import java.util.*;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> hasset = new TreeSet<>();
        hasset.add(12);
        hasset.add(10);
        hasset.add(52);
        hasset.add(7);
        hasset.add(4);

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
// A TreeSet allocates memory to its items by using a balanced binary search
// tree structure. It typically implements a self-balancing binary search tree
// called a red-black tree.