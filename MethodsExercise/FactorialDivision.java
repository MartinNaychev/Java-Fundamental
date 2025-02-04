package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = getDividedFactorials(firstNumber);
        long secondFactorial = getDividedFactorials(secondNumber);
        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f",result);

    }

    private static long getDividedFactorials(int number) {
        long factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        return factorial;
    }
}
