import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = size - 1;
        int mid = (low + high) / 2;
        int key = 7;

        while (low <= high) {
            if (arr[mid] == key) {
                System.out.println("Key is at index" + mid);
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (key > arr[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }
    }
}

// size = 5
// 0 1 2 3 4
// 5 10 15 20 25