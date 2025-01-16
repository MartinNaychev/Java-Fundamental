package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double out = input / 1000;

        System.out.printf("%.2f",out);
    }
}
