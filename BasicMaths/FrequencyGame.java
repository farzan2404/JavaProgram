import java.util.*;

public class FrequencyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        System.out.println(greatest);
    }
}

// n = 5
// 2 2 5 50 10