package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            int maxInteger = getMax(firstNumber, secondNumber);
            System.out.println(maxInteger);
        } else if (type.equals("string")) {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            String maxString = getMax(firstString, secondString);
            System.out.println(maxString);
        } else {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            char maxChar = getMax(firstChar, secondChar);
            System.out.println(maxChar);
        }
    }

    private static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }
}
