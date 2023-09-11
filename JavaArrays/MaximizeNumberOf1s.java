import java.util.*;

public class MaximizeNumberOf1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int longest = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count0s = 0;
            int count1s = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0 && count0s == m) {
                    j = n - 1;
                } else if (arr[j] == 0 && count0s < m) {
                    count0s++;
                    count1s++;
                } else if (arr[j] == 1) {
                    count1s++;
                }
            }
            if (count1s > longest) {
                longest = count1s;
            }
        }
        System.out.println(longest);
    }
}

// Brute Force approach
// N = 11
// 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1
// M = 3
// 1 0 1 1 0 0 1 1 0 1
// 2