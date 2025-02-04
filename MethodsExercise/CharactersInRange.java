package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        getChars(firstChar, secondChar);
    }

    private static void getChars(int firstChar, int secondChar) {

        for (int i = Math.min(firstChar,secondChar) + 1; i < Math.max(firstChar,secondChar); i++) {
            System.out.print((char) i + " ");
        }

    }
}
