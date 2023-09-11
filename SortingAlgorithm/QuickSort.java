import java.util.*;

public class QuickSort {
    static int Partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static int[] QS(int arr[], int low, int high) {
        if (low < high) {
            int PIndex = Partition(arr, low, high);
            QS(arr, low, PIndex - 1);
            QS(arr, PIndex + 1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = arr.length - 1;

        QS(arr, low, high);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 4 6 2 5 7 9 1 3
