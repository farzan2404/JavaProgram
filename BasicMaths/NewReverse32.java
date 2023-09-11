import java.util.*;

public class NewReverse32 {
    public static void main(String[] args) {
        int number = 10; // Replace with your desired integer number
        String reveString = "";

        String binaryString = Integer.toBinaryString(number);
        String paddedBinaryString = String.format("%32s", binaryString).replace(' ', '0');
        System.out.println(paddedBinaryString.length());
        for (int i = 1; i <= paddedBinaryString.length(); i++) {
            char BitsFromLast = paddedBinaryString.charAt(paddedBinaryString.length() - i);
            reveString = reveString + BitsFromLast;
        }
        System.out.println(paddedBinaryString);
        System.out.println(reveString);

        long integer = Long.parseLong(reveString, 2);
        System.out.println(integer);
    }
}
