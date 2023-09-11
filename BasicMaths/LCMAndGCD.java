import java.util.*;

public class LCMAndGCD {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 14;
        int divisor = 1;
        int finalDivisor = 0;
        long divisibleByBoth = 1000000;
        long finalDivisible = 0;
        while (divisor <= num1 && divisor <= num2) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                finalDivisor = divisor;
                divisor++;
            } else {
                divisor++;
            }
        }
        System.out.println("Divisor is:" + finalDivisor);

        while (divisibleByBoth >= num1 && divisibleByBoth >= num2) {
            if (divisibleByBoth % num1 == 0 && divisibleByBoth % num2 == 0) {
                finalDivisible = divisibleByBoth;
                divisibleByBoth--;
            } else {
                divisibleByBoth--;
            }
        }
        System.out.println("Number divisible by both number is:" + finalDivisible);
    }
}
