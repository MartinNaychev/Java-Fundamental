package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String user : input) {
            boolean validateUser = validatingUsername(user);
            if (validateUser) {
                System.out.println(user);
            }

        }

    }

    private static boolean validatingUsername(String user) {
        if (user.length() < 3 || user.length() > 16) {
            return false;
        }
        for (char currentSymbol : user.toCharArray()) {
            if (!Character.isLetter(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }

        return true;
    }
}
