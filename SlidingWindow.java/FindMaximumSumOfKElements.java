import java.util.*;

public class FindMaximumSumOfKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int max_sum = 0;
        int window_sum = 0;
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        if (k > N) {
            System.out.println(" Invalid");
        }

        for (int i = 0; i < k; i++) {
            window_sum = window_sum + arr[i];
        }
        max_sum = window_sum;

        for (int i = k; i < N; i++) {
            window_sum = window_sum + arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        System.out.println(max_sum);

    }
}

// N = 5
// K = 3
// 5 2 1 3 6