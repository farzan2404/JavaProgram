import java.util.*;

public class FrequenciesofLimitedRangeArrayElementsUsingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> numbers = new HashMap<>();
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (numbers.containsKey(arr[i])) {
                numbers.put(arr[i], numbers.get(arr[i]) + 1);
            } else {
                numbers.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : numbers.entrySet()) {
            System.out.print(e.getKey() + ":" + e.getValue() + " ");
        }

    }
}
// 2 3 2 3 5