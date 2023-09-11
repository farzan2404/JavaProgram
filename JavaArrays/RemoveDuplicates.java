import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[size];

        for (int i = 0; i < size; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(hash[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            if (hash[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// 1 1 2 2 3