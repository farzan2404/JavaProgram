import java.util.Scanner;

public class Print1toNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        printing(i, N);
    }

    static void printing(int i, int N) {

        if (i == N) {
            System.out.println(i + " ");
        } else {
            System.out.print(i + " ");
            i++;
            printing(i, N);
        }
    }
}