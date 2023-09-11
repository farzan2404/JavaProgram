import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int range = 9999;
        String result = " Prime number";
        for (int i = 2; i <= range; i++) {
            if (number % i == 0 && number > i) {
                result = "Not a Prime";
                break;
            }
        }
        System.out.println(result);
    }
}
