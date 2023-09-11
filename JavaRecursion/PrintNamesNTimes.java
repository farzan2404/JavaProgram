import java.util.*;

public class PrintNamesNTimes {
    public static void main(String[] args) {
        int i = 1;
        printing(i);
    }

    static void printing(int i) {
        if (i == 10) {
            System.out.println("My name is Farzan");
        } else {
            System.out.println("My name is Farzan");
            i++;
            printing(i);
        }
    }
}
