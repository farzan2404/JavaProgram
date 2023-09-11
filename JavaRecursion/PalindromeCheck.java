import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        String ans = PalindromeCheck(str, count, 0);
        System.out.println(ans);
    }

    public static String PalindromeCheck(String str, int count, int i) {
        String result = "Palindrome";
        if (i < str.length() / 2) {
            if (str.charAt(i) == str.charAt(count - 1)) {
                i++;
                count--;
                result = PalindromeCheck(str, count, i); // Assign the result of the recursive call
            } else {
                result = "!Palindrome";
            }
        }
        return result;
    }
}
