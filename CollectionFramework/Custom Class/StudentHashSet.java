// package CollectionFramework;

import java.util.*;

public class StudentHashSet {
    public static void main(String[] args) {
        Set<Student> studentset = new HashSet<>();
        // studentset.add(new Student("Farzan", 14));
        // studentset.add(new Student("Azim", 11));
        // studentset.add(new Student("Arkaan", 21));
        // studentset.add(new Student("Tausif", 14));
        // System.out.println(studentset);
        // // If we do till here in output we get some type of hashcode or object of the
        // // class will be printed, not its value.

        studentset.add(new Student("Farzan", 14));
        studentset.add(new Student("Azim", 11));
        studentset.add(new Student("Arkaan", 21));
        studentset.add(new Student("Tausif", 14));
        System.out.println(studentset);

        Student s1 = new Student("Alex", 2);
        Student s2 = new Student("Henry", 4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // It will true because obj s1 and s2 generates the same hashcode, coz having
        // same rollno.

    }
}
