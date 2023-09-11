// package CollectionFramework;

import java.util.*;

public class CompareTwoStudWithComparable {
    public static void main(String[] args) {
        List<Student2> studentset = new ArrayList<>();
        // studentset.add(new Student2("Farzan", 14));
        // studentset.add(new Student2("Azim", 11));
        // studentset.add(new Student2("Arkaan", 21));
        // studentset.add(new Student2("Tausif", 14));
        // // System.out.println(studentset);
        // // If we do till here in output we get some type of hashcode or object of the
        // // class will be printed, not its value.

        studentset.add(new Student2("Farzan", 14));
        studentset.add(new Student2("Azim", 11));
        studentset.add(new Student2("Arkaan", 21));
        studentset.add(new Student2("Tausif", 14));
        System.out.println(studentset);

        Student2 s1 = new Student2("Alex", 2);
        Student2 s2 = new Student2("Henry", 4);
        System.out.println(s1.compareTo(s2));

        Collections.sort(studentset, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(studentset);

    }
}
