import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 216749;
        int bucket = 0;
        while (number != 0) {
            int remainder = number % 10;
            bucket = bucket * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of a number:" + bucket);
    }
}
