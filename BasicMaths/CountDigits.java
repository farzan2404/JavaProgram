// package JavaBasic;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        int number = 10221346;
        int count = 0;
        int frequencyofEvenly = 0;
        int duplicateof = number;

        while (number != 0) {
            int last_number = number % 10;
            if (last_number != 0 && duplicateof % last_number == 0) {
                frequencyofEvenly++;
            }
            number = number / 10;
            count++;
        }

        System.out.println("Count is:" + count);
        System.out.println("Total evenly dividing numbers:" + frequencyofEvenly);
    }
}
