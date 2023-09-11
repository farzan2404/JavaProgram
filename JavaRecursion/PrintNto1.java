import java.util.*;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printing(N);
    }

    static void printing(int N) {

        if (N == 1) {
            System.out.println(N + " ");
        } else {
            System.out.print(N + " ");
            N--;
            printing(N);
        }
    }
}
