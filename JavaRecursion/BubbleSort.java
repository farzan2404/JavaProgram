import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        System.out.println(Arrays.toString(Sort(arr, i, j)));
    }

    static int[] Sort(int arr[], int i, int j) {
        if (i == arr.length) {
            return arr;
        }
        if ((j + 1) == arr.length) {
            i++;
            j = 0;
        }
        if ((j + 1) < arr.length) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        return Sort(arr, i, j);

    }
}
// 4 1 2 5 3
// In summary, return Sort(arr, i, j); is used when there are more sorting
// iterations required, and the method needs to continue the recursive calls to
// complete the sorting process. On the other hand, return arr; is used when the
// sorting is already complete, and the method can return the sorted array
// without any further iterations.