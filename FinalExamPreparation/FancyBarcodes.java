package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z]([A-Za-z0-9]{4,})[A-Z]@#+";

        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder numbers = new StringBuilder();

            if (matcher.find()){
                for (char symbol : input.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        numbers.append(symbol);
                    }
                }
                if (numbers.isEmpty()){
                    System.out.println("Product group: 00");
                }else {
                    System.out.printf("Product group: %s%n",numbers);
                }
            }else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
