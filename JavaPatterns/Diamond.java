package JavaPatterns;

import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextByte();
        int duplicate = 0;
        int duplicate2 = size;

        // Upper triangle
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j < duplicate2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            duplicate2--;

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Down triangle
        for (int i = 0; i < size; i++) {

            int star = 2 * size - (i + 1);

            for (int j = 0; j < star; j++) {

                if (j < duplicate) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            duplicate++;
            System.out.println();
        }
        sc.close();

    }
}
