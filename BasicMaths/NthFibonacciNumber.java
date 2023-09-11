import java.util.*;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n);
        }

        int NthNumber = (int) n;
        long[] arr = new long[NthNumber + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= NthNumber; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            arr[i] %= 1000000007;
        }

        System.out.print(arr[NthNumber]);
    }
}
