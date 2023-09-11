import java.util.*;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int size = sc.nextInt();
        int k = 3;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int arrlen = 0;
        int longlen = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            numbers.put(sum, i);
            if (numbers.containsKey(sum - k) == true) {
                int i2 = numbers.get(sum - k);
                arrlen = i - i2;
                if (arrlen > longlen) {
                    longlen = arrlen;
                }
            }
            if (sum == k) {
                arrlen = i + 1;
                longlen = arrlen;
            }
        }
        System.out.println(longlen);
    }
}

// 6 3
//
// 0 1 2 3 4 5