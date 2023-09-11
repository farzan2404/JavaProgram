import java.util.*;

public class BooleanPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        boolean ans = PalindromeCheck(str, 0, count);
        System.out.println(ans);
    }

    static boolean PalindromeCheck(String str, int i, int count) {
        if (i <= count / 2) {
            if (str.charAt(i) != str.charAt(count - i - 1)) {
                return false;
            } else {
                return true;
            }
        }
        return PalindromeCheck(str, i + 1, count);
    }
}

// madsm