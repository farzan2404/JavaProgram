import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int reverseArr[] = new int[size];
        int i = 0;
        int j = size - 1;
        InsertInArray(arr, size, i);
        ReverseArray(reverseArr, arr, size, j, i);
        PrintArray(reverseArr, size, i);
    }

    static void InsertInArray(int arr[], int size, int i) {
        Scanner sc = new Scanner(System.in);
        if (i == arr.length - 1) {
            arr[i] = sc.nextInt();
        } else {
            arr[i] = sc.nextInt();
            i++;
            InsertInArray(arr, size, i);
        }
    }

    static void ReverseArray(int reverseArr[], int arr[], int size, int j, int i) {
        if (j == 0) {
            reverseArr[j] = arr[i];
        } else {
            reverseArr[j] = arr[i];
            j--;
            i++;
            ReverseArray(reverseArr, arr, size, j, i);
        }
    }

    static void PrintArray(int reverseArr[], int size, int i) {
        if (i == size - 1) {
            System.out.print(reverseArr[i] + " ");
        } else {
            System.out.print(reverseArr[i] + " ");
            i++;
            PrintArray(reverseArr, size, i);
        }
    }
}
