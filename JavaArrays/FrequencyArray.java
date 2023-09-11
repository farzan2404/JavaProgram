import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int hash[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            hash[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(hash[i] + " ");
        }
    }
}

// arr = {1,2,2,3,1}.