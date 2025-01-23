package DataTypesAndVariablesExercise.More;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (isInteger(input)) {
                System.out.println(Integer.parseInt(input) + " is integer type");
            } else if (isDouble(input)) {
                System.out.println(Double.parseDouble(input) + " is floating point type");
            } else if (isBoolean(input)) {
                System.out.println(input +  " is boolean type");
            } else if (input.length() == 1) {
                System.out.println(input.charAt(0) + " is character type");
            } else {
                if (!input.isEmpty()) {
                    System.out.println(input + " is string type");
                }
            }
            input = scanner.nextLine();
        }
        scanner.close();

    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");

    }
}
