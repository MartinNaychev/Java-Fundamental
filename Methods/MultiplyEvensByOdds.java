package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int sum = validateSum(number);
        System.out.println(sum);
    }

    private static int validateSum(int number) {
        int evenNumber = 0;
        int oddNumber = 0;

        while (number > 0) {

            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                oddNumber += lastDigit;
            } else {
                evenNumber += lastDigit;
            }
            number /= 10;
        }
        return evenNumber * oddNumber;
    }
}
