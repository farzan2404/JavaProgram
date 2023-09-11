import java.util.*;

public class Reverse32Bits {
    public static void main(String[] args) {
        int number = 10;
        String remainder = "";
        String bits = "00000000000000000000000000000000";

        while (number != 0) {
            if (number == 1) {
                remainder = "1" + remainder;
            } else {
                remainder = number % 2 + remainder;
            }
            number = number / 2;
        }

        String remainderPlus32Bits = remainder + bits; // Ans + 32 bits.

        StringBuilder stringBuilder = new StringBuilder(remainderPlus32Bits); // StringBuilder class to delete the
                                                                              // letters from the strings
        int TotalBitslength = stringBuilder.length();
        if (remainder.length() <= TotalBitslength) {
            stringBuilder.delete(TotalBitslength - remainder.length(), TotalBitslength);
        }
        String reducedString = stringBuilder.toString(); // Converting to String.
        System.out.println(TotalBitslength);
        System.out.println(remainder);
        System.out.println(reducedString);
        System.out.println(reducedString.length());

        long newDecimalString = Long.parseLong(reducedString, 2); // Converting binary string into integer
        System.out.println(newDecimalString);

    }
}
