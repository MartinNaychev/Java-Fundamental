package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+.?[\\d]+)\\$";


        String input = scanner.nextLine();
        double totalIncome = 0.00;

        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count * price;
                totalIncome += sum;
                System.out.printf("%s: %s - %.2f%n", name, product, sum);
            }


            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}