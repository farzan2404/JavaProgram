import java.util.*;

public class MistakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        String ans = PalindromeCheck(str, count, 0);
        System.out.println(ans);
    }

    public static String PalindromeCheck(String str, int count, int i) {
        String result = "Palindrome";
        if (i < str.length() && count > 0) {
            if (str.charAt(i) == str.charAt(count - 1)) {
                i++;
                count--;
                PalindromeCheck(str, count, i);
            } else {
                result = "!Palindrome";
            }
        }
        return result;
    }

}

// The mistake
// in your
// code lies
// in the
// recursive call
// to the
// PalindromeCheck method.Currently,
// you are
// not assigning
// the result
// of the
// recursive call
// to the
// result variable.
// This means
// that even if
// a mismatch
// occurs in
// the characters, the
// code does
// not update
// the result
// and continues
// with the
// current result, which is"Palindrome".
// To fix this issue,
// you need
// to assign
// the result
// of the
// recursive call
// to the
// result variable.Here's
// the modified code
//