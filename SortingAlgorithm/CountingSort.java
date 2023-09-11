import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        int output[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int hash[] = new int[max + 1];
        for (int i = 0; i < max + 1; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        for (int i = 0; i < max + 1; i++) {
            System.out.print(hash[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < max + 1; i++) {
            if (i < (max)) {
                hash[i + 1] = hash[i] + hash[i + 1];
            }
        }
        for (int i = 0; i < max + 1; i++) {
            System.out.print(hash[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            output[hash[arr[i]] - 1] = arr[i];
            if (hash[arr[i]] > 1) {
                hash[arr[i]] = hash[arr[i]] - 1;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

// 4 1 3 5 3
// count: 0 1 0 2 1 1
// count: 0 1 1 3 4 5
// output:
