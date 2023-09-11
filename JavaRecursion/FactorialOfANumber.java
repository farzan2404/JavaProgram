import java.util.*;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factorial = 1;
        int i = 1;
        FindFactorial(N, factorial, i);
    }

    public static void FindFactorial(int N, int factorial, int i) {
        if (i == N) {
            System.out.print(factorial * i + " ");
        } else {
            factorial = factorial * i;
            i++;
            FindFactorial(N, factorial, i);
        }
    }
}
