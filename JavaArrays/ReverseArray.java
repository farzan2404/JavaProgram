import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int j = 0;
        int arr[] = new int[size];
        int duplicate[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            duplicate[i] = arr[j];
            j++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}
