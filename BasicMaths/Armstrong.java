import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Armstrong = sc.nextInt();
        int finalArmstrong = Armstrong;
        int digits = (int) Math.floor(Math.log10(Armstrong) + 1);
        int number = 0;

        int i = 0;
        while (i < digits) {
            number = (int) (number + Math.pow(Armstrong % 10, digits));
            Armstrong = Armstrong / 10;
            i++;
        }
        if (number == finalArmstrong) {
            System.out.println("Number is a Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }
}

// num = 153;
// 1^3 + 5^3 + 3^3 = 153;
// 1 + 125 + 27 = 153;