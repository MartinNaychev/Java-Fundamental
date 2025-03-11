package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double totalSum = 0.0;

        for (String word : input) {
            double stringSum = validateStringSum(word);
            totalSum += stringSum;

        }

        System.out.printf("%.2f", totalSum);


    }

    private static double validateStringSum(String word) {
        char firstLatter = word.charAt(0);
        double numbers = Double.parseDouble(word.substring(1, word.length() - 1));
        char lastLatter = word.charAt(word.length() - 1);

        if (Character.isUpperCase(firstLatter)) {
            int position = firstLatter - 64;
            numbers = numbers / position;

        } else if (Character.isLowerCase(firstLatter)) {
            int position = firstLatter - 96;
            numbers = numbers * position;

        }


        if (Character.isUpperCase(lastLatter)){
            int position = lastLatter - 64;
            numbers -=position;

        } else if (Character.isLowerCase(lastLatter)) {
            int position = lastLatter - 96;
            numbers+=position;

        }


        return numbers;
    }
}
