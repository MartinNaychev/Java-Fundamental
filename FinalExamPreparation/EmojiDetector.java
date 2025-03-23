package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String regex = "([:*]{2})[A-Z][a-z]{2,}\\1";
        //Pattern pattern = Pattern.compile(regex);
        Pattern pattern = Pattern.compile("(:{2}|\\*{2})[A-Z][a-z]{2,}\\1");

        String input = scanner.nextLine();
        int coolThreshold = 1;

        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {

                int number = Integer.parseInt(String.valueOf(symbol));
                coolThreshold *= number;

            }
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        List<String> output = new ArrayList<>();

        Matcher matcher = pattern.matcher(input);
        int counter = 0;
        while (matcher.find()) {
            String emoji = matcher.group();
            int valueOf = 0;


            for (int position = 2; position <emoji.length()-2 ; position++) {
                valueOf+=emoji.charAt(position);
            }

            if (valueOf >= coolThreshold) {
                output.add(emoji);
            }


            counter++;
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);

        for (String emoji : output) {
            System.out.println(emoji);

        }


    }
}
