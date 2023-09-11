import java.util.*;

public class FindAllFactorialNumberslessthanOrequaltoN {
    public static void main(String[] args) {
        ArrayList<Long> numbers = new ArrayList<Long>();
        int N = 6;
        int FactorialNos = 1;
        for (int i = 1; i <= N; i++) {
            if (i * FactorialNos <= N) {
                FactorialNos = i * FactorialNos;
                numbers.add(FactorialNos);
            } else {
                break;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
