package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        BigDecimal count = new BigDecimal(0);

        for (int i = 0; i < input; i++) {
            BigDecimal countTo = new BigDecimal(scanner.nextLine());
            count=count.add(countTo);
        }

        System.out.println(count);
    }
}
