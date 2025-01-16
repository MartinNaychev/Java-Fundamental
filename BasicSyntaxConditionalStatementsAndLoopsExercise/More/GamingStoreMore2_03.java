package BasicSyntaxConditionalStatementsAndLoopsExercise.More;

import java.util.Scanner;

public class GamingStoreMore2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double spent = budget;

        while (!"Game Time".equals(input)) {
            if (budget > 0) {
                if (input.equals("OutFall 4")) {
                    if (budget>=39.99) {
                        budget -= 39.99;
                        System.out.println("Bought OutFall 4");
                    }else {
                        System.out.println("Too Expensive");
                    }
                } else if (input.equals("CS: OG")) {
                    if (budget>=15.99) {
                        budget -= 15.99;
                        System.out.println("Bought CS: OG");
                    }else {
                        System.out.println("Too Expensive");
                    }
                } else if (input.equals("Zplinter Zell")) {
                    if (budget>=19.99) {
                        budget -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }else {
                        System.out.println("Too Expensive");
                    }
                } else if (input.equals("Honored 2")) {
                    if (budget>=59.99) {
                        budget -= 59.99;
                        System.out.println("Bought Honored 2");
                    }else {
                        System.out.println("Too Expensive");
                    }
                } else if (input.equals("RoverWatch")) {
                    if (budget>=29.99) {
                        budget -= 29.99;
                        System.out.println("Bought RoverWatch");
                    }else {
                        System.out.println("Too Expensive");
                    }
                } else if (input.equals("RoverWatch Origins Edition")) {
                    if (budget>=39.99) {
                        budget -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }else {
                        System.out.println("Too Expensive");
                    }
                }
                else {
                    System.out.println("Not Found");
                }
            }
            if (budget==0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent - budget,budget);
    }
}
