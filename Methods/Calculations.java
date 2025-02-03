package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculationType = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        if (calculationType.equals("add")) {
            validateAdd(firstNumber, secondNumber);
        } else if (calculationType.equals("multiply")) {
            validateMultiply(firstNumber, secondNumber);
        } else if (calculationType.equals("subtract")) {
            validateSubtract(firstNumber, secondNumber);
        } else {
            validateDivide(firstNumber, secondNumber);
        }
    }
    private static void validateAdd (int first, int second){
        System.out.println(first+second);
    }
    private static void validateMultiply (int first, int second){
        System.out.println(first*second);
    }
    private static void validateSubtract (int first, int second){
        System.out.println(first-second);
    }
    private static void validateDivide (int first, int second){
        System.out.println(first/second);
    }

}
