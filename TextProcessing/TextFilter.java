package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] wordsForBan = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String word : wordsForBan) {
            String replacement = "*".repeat(word.length());
            input = input.replace(word,replacement);
        }
        System.out.println(input);

    }
}
