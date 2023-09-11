import java.util.*;

public class StringCountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hash[] = new int[26];
        int output[] = new int[str.length()];
        String finalstr = "";

        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            hash[letter - 'a'] = hash[letter - 'a'] + 1;
        }
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < hash.length; i++) {
            if (i < hash.length - 1) {
                hash[i + 1] = hash[i] + hash[i + 1];
            }
        }
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            output[hash[str.charAt(i) - 'a'] - 1] = str.charAt(i) - 'a';
            if (hash[str.charAt(i) - 'a'] > 1) {
                hash[str.charAt(i) - 'a'] = hash[str.charAt(i) - 'a'] - 1;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            int ascii = output[i] + 97;
            char finalChar = (char) ascii;
            System.out.print(finalChar + " ");
        }
    }
}
// 4 1 3 5 3
// count: 0 1 0 2 1 1
// count: 0 1 1 3 4 5
// output: