package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        getTheSmallestNumber(firstNumber, secondNumber, thirdNumber);

    }

    private static void getTheSmallestNumber(int first, int second, int third) {
        int smallestNumber = Math.min(Math.min(first, second), third);

        System.out.println(smallestNumber);
    }
}

