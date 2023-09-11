// package CollectionFramework;

import java.util.*;

public class Student2 implements Comparable<Student2> {
    String name;
    int rollNo;

    public Student2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

        // Override method is used to inherit the properties of parent class in
        // subclass.
        // we can make constructor name same as class Name.

    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student2 other = (Student2) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;

    }

    @Override
    public int compareTo(Student2 that) {
        return this.rollNo - that.rollNo;
    }
}
