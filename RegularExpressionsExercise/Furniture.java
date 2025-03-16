package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[\\w]+)<<(?<price>[\\d]+.?[\\d]+)!(?<quantity>[\\d]+)";

        String input = scanner.nextLine();
        double totalSum = 0.00;

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double sum = price * quantity;
                totalSum+=sum;
                System.out.println(furniture);

            }

            input= scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalSum);


    }
}
