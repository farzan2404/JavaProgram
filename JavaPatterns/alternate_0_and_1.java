package JavaPatterns;

import java.util.*;

public class alternate_0_and_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("1");
                    System.out.print(" ");
                } else {
                    System.out.print("0");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
