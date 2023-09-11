import java.util.*;

public class FindFactorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * (i);
        }
        System.out.println(factorial);
    }
}
