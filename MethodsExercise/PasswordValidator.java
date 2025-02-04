package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();


        boolean charactersLength = validateCharactersLength(password);

        if (!charactersLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean charactersAndDigits = validateCharactersAndDigit(password);

        if (!charactersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean atLeastTwoDigits = validateAtLeastTwoDigits(password);

        if (!atLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (charactersLength && charactersAndDigits && atLeastTwoDigits) {
            System.out.println("Password is valid");
        }

    }

    private static boolean validateCharactersLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean validateCharactersAndDigit(String password) {

       for (char position : password.toCharArray()){

            if (!Character.isLetterOrDigit(position)) {
                return false;
            }

        }
        return true;
    }

    private static boolean validateAtLeastTwoDigits(String password) {
        int counter = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                counter++;
            }
        }
        return counter>=2;
    }
}
