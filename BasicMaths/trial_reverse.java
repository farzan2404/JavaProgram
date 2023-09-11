import java.util.*;

public class trial_reverse {
    public static void main(String[] args) {
        int num = 124247;
        int count = (int) (Math.floor(Math.log10(num)) + 1);
        String revStr = "";
        for (int i = 0; i < count; i++) {
            revStr = revStr + num % 10;
            num = num / 10;
        }
        long intReverse = Long.parseLong(revStr);
        System.out.println(intReverse);
    }
}
