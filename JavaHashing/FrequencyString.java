import java.util.*;

public class FrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char letter = ' ';
        int hash[] = new int[26];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            hash[letter - 'a'] = hash[letter - 'a'] + 1;
        }
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i] + " ");
        }
    }
}

// string = farzan