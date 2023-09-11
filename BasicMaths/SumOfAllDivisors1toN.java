import java.util.*;

public class SumOfAllDivisors1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 4
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total = total + getDivisorSum(i);
        }
        System.out.println("The total of " + N + " is: " + total);
    }

    public static int getDivisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

/*
 * Input
 * N = 4
 * Output:
 * 15
 * Explanation:
 * F(1) = 1
 * F(2) = 1 + 2 = 3
 * F(3) = 1 + 3 = 4
 * F(4) = 1 + 2 + 4 = 7
 * F(5) = 1 + 5 = 6
 * F(6) = 1 + 2 + 3 + 6 = 12
 * ans = F(1) + F(2) + F(3) + F(4)
 * = 1 + 3 + 4 + 7
 * = 15
 */
