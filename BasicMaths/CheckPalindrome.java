import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        String number = "12321";

        int i = 0;
        while (i < number.length()) {
            char startingChar = number.charAt(i);
            char endingChar = number.charAt(number.length() - 1 - i);
            if (startingChar == endingChar) {
                System.out.println(startingChar + ":" + endingChar + " Palindrome ");
            } else {

                System.out.println(startingChar + ":" + endingChar + " Not a Palindrome");
                return;
            }
            i++;
        }
    }
}
