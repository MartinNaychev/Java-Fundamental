package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        validatingVowels(input);
    }

    private static void validatingVowels(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == 'a' || currentSymbol == 'o' || currentSymbol == 'u'
                    || currentSymbol == 'e' || currentSymbol == 'i') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
