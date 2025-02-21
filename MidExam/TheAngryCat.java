package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int comparisonNumber = numbers[entryPoint];
        int rightSum = 0;
        int leftSum = 0;


        if (command.equals("cheap")) {
            for (int i = 0; i < entryPoint; i++) {
                int currentNumber = numbers[i];
                if (currentNumber < comparisonNumber) {
                    leftSum += currentNumber;
                }
            }
            for (int i = entryPoint + 1; i < numbers.length; i++) {
                int currentNumber = numbers[i];
                if (currentNumber < comparisonNumber) {
                    rightSum += currentNumber;
                }
            }

        } else if (command.equals("expensive")) {

            for (int i = 0; i < entryPoint; i++) {
                int currentNumber = numbers[i];
                if (currentNumber >= comparisonNumber) {
                    leftSum += currentNumber;
                }
            }
            for (int i = entryPoint + 1; i < numbers.length; i++) {
                int currentNumber = numbers[i];
                if (currentNumber >= comparisonNumber) {
                    rightSum += currentNumber;
                }
            }

        }
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }

    }
}
