// package JavaPatterns;

import java.util.*;

public class ABC_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char upperCase = 'A';
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(upperCase);
                upperCase++;
            }
            System.out.println();
            upperCase = 'A';
        }
    }
}
// A
// AB
// ABC
// ABCD
// ABCDE