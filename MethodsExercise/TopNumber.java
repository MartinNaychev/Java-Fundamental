package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int position = 1; position <= number; position++) {

            boolean isDivisible = validateDivisible(position);
            boolean oddDigit = validateOddDigit(position);

            if (isDivisible && oddDigit) {
                System.out.println(position);
            }

        }

    }

    private static boolean validateDivisible(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean validateOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

}
