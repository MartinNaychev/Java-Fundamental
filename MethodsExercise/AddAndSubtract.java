package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = getSum(firstNumber,secondNumber);
        int subtract = getSubtract(sum,thirdNumber);
        System.out.println(subtract);

    }
    private static int getSum(int first,int second){
        return first+second;
    }
    private static int getSubtract(int first, int second){
        return first-second;
    }
}
