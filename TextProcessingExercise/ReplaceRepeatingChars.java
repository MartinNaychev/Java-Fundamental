package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder word = new StringBuilder();
        char [] symbols = input.toCharArray();
        word.append(symbols[0]);
        for (int i = 1; i < input.length(); i++) {
            if (symbols[i] != symbols[i-1]){
                word.append(symbols[i]);
            }

        }
        System.out.println(word);


    }
}
