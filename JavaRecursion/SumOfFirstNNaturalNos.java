import java.util.*;

public class SumOfFirstNNaturalNos {
    public static void main(String[] args) {
        int N = 5;
        int sum = 0;
        int i = 1;
        SumOfNumbers(N, i, sum);
    }

    public static void SumOfNumbers(int N, int i, int sum) {
        if (i == N) {
            System.out.print((sum + i) + " ");
        } else {
            sum = sum + i;
            i++;
            SumOfNumbers(N, i, sum);
        }
    }
}

// int n = 6;
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// sum = sum + i;
// }
// System.out.println(sum);