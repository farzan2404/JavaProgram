import java.util.*;

public class SumOfNtermsUsingRecursion {
    public static void main(String[] args) {
        int N = 7;
        int i = 1;
        int sum = 0;
        Nterms(N, i, sum);
    }

    public static void Nterms(int N, int i, int sum) {
        if (i == N) {
            System.out.print((sum + (int) Math.pow(i, 3)) + " ");
        } else {
            sum = sum + ((int) Math.pow(i, 3));
            i++;
            Nterms(N, i, sum);
        }
    }
}
// N = 5
// 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225