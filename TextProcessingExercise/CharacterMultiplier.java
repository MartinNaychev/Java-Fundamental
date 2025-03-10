package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split( " ");

        String firstInput = input[0];
        String secondInput = input[1];

        stringSum(firstInput, secondInput);
    }

    private static void stringSum(String firstInput, String secondInput) {
        char[] first = firstInput.toCharArray();
        char[] second = secondInput.toCharArray();
        int sum = 0;

        if (first.length < second.length) {
            for (int i = 0; i < first.length; i++) {
                sum = sum + (first[i] * second[i]);
            }
            for (int i = first.length; i < second.length; i++) {
                sum += second[i];

            }
        } else {
            for (int i = 0; i < second.length; i++) {
                sum = sum + (first[i] * second[i]);
            }
            for (int i = second.length; i < first.length; i++) {
                sum += first[i];

            }

        }
        System.out.println(sum);
    }
}
