package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        int totalPower = 0;

        for (int position = 0; position < input.length(); position++) {
            char currentSymbol = input.charAt(position);

            if (currentSymbol == '>') {
                int power = Integer.parseInt(input.charAt(position + 1)+"");
                totalPower += power;
            } else if (totalPower > 0) {
                input.deleteCharAt(position);
                totalPower--;
                position--;
            }

        }

        System.out.println(input);


    }
}
