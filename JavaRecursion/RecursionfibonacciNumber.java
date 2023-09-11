import java.util.*;

public class RecursionfibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 2;
        int arr[] = new int[N + 1]; // 6
        int arr2[] = new int[N + 1];
        arr2 = FiboSeries(N, arr, i);
        for (int j = 0; j < N + 1; j++) {
            arr2[j] = arr[j];
            System.out.print(arr2[j] + " ");
        }
    }

    static int[] FiboSeries(int N, int arr[], int i) {
        if (i == N) {
            arr[i] = arr[i - 1] + arr[i - 2];
            return arr;
        }
        if (N == 1) {
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i - 1] + arr[i - 2];
            FiboSeries(N, arr, i + 1);
        }
        return arr;
    }
}

// N = 5.
// 0 1 1 2 3 5.