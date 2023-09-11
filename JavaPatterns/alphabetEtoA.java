package JavaPatterns;

import java.util.*;

public class alphabetEtoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int k = (69 - i);
            for (int j = 0; j <= i; j++) {
                char m = (char) (k + j);
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
