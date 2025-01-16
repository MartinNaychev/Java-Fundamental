package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        double dollars = 1.36;

        System.out.printf("%.3f", input*dollars);



    }
}
