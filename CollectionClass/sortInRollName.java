// package CollectionClass;

import java.io.*;
import java.lang.*;
import java.util.*;

class Student {
    int rollNo;
    String Address, Name; // instance variable.

    public Student(int rollNo, String Name, String Address) { // Constructor of the class.
        this.rollNo = rollNo;
        this.Name = Name; // local variable
        this.Address = Address;
    }

    public String toString() {
        return this.rollNo + " " + this.Name + " " + this.Address;
    }
}

class sortByroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }
}

class sortByname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.Name.compareTo(b.Name);
    }
}

public class sortInRollName {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Farzan", "Mumbai"));
        ar.add(new Student(101, "Azim", "Goa"));
        ar.add(new Student(120, "Amaan", "Delhi"));
        // It is necessary to create object of the class Student, without applying new
        // Student object it will give an error. Because it is inappropriate to add
        // multiple args at one time. So we are adding objects of the class Student each
        // time.
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println();

        Collections.sort(ar, new sortByroll());

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println();

        Collections.sort(ar, new sortByname());

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}
