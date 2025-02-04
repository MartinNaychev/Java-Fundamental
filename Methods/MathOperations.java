package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int total = getTotal(firstNumber,operator,secondNumber);
        System.out.println(total);



    }

    private static int getTotal (int firstNumber, String operator, int secondNumber){
        int total = switch (operator) {
            case "/" -> firstNumber / secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            default -> 0;
        };
        return total;
    }
}
