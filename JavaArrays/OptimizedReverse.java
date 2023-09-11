import java.util.*;

public class OptimizedReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int p1 = 0;
        int p2 = size - 1;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size / 2; i++) {

            temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;
            p1++;
            p2--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
