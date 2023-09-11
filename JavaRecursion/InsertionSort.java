import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Insertion(arr, size, 0, 0);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Insertion(int arr[], int size, int i, int j) {
        if (i == size) {
            return;
        }
        j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        i++;
        Insertion(arr, size, i, j);
    }
}

// 5 2 3 4 1
// 2 5 3 4 1
// 2 3 5 4 1
// 2 3 4 5 1
// 1 2 3 4 5