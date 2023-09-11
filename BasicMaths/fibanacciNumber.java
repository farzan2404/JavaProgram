import java.util.*;

public class fibanacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        if (N == 1) {
            arr[0] = 0;
            arr[1] = 1;

        } else {
            arr[0] = 0;
            arr[1] = 1;
        }
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
