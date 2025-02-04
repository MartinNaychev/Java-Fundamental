package Methods;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double poweredNumber = validateNumber(number,power);
        System.out.printf("%.0f",poweredNumber);

    }

    private static double validateNumber (int number, int power){

        return Math.pow(number,power);
    }
}
