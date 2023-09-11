import java.util.*;

public class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        String result = " String is not Palindrome";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(count - 1)) {
                count--;
                result = " String is Palindrome";
            } else {
                result = " String is not a Palindrome";
                break;
            }
        }
        System.out.println(result);
    }
}
