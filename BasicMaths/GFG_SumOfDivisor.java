import java.util.*;

public class GFG_SumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 4
        long sum = 0;
        for (int i = 1; i <= N; i++)
            sum += (N / i) * i;
        System.out.println("Sum is: " + sum);
    }
}
