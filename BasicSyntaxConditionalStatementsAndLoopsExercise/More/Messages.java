package BasicSyntaxConditionalStatementsAndLoopsExercise.More;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String message = "";
        int offset = 0;

        for (int i = count; i > 0; i--) {

            String input = scanner.nextLine();
            int digitLength = input.length();
            char extractNumber = input.charAt(input.length() - 1);
            int mainDigit = Integer.parseInt(String.valueOf(extractNumber));

            if (mainDigit == 8 || mainDigit == 9) {
                offset = ((mainDigit - 2) * 3) + 1;
            } else {
                offset = (mainDigit - 2) * 3;
            }
            int result = (offset + digitLength - 1) + 97;
            char letter = (char) result;

            if (mainDigit == 0) {
                letter = 32;
            }
            message += letter;
        }
        System.out.println(message);
    }
}
