package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder word = new StringBuilder();

        for (char currentSymbol : input.toCharArray()) {
            char symbol =(char) (currentSymbol+3);
            word.append(symbol);
        }
        System.out.println(word);


    }
}
