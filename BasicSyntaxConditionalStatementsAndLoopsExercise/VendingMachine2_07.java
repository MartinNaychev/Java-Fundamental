package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double number = 0.00;
        double totalMoney = 0.00;

        while (!"Start".equals(input)) {
            number = Double.parseDouble(input);
            if (number == 0.1) {
                totalMoney += number;
                input = scanner.nextLine();
            } else if (number == 0.2) {
                totalMoney += number;
                input = scanner.nextLine();
            } else if (number == 0.5) {
                totalMoney += number;
                input = scanner.nextLine();
            } else if (number == 1) {
                totalMoney += number;
                input = scanner.nextLine();
            } else if (number == 2) {
                totalMoney += number;
                input = scanner.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f%n", number);
                input = scanner.nextLine();
            }
        }

        input = scanner.nextLine();

        while (!"End".equals(input)) {

            if ("Nuts".equals(input)) {

                if (totalMoney < 2.0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 2.0;
                    System.out.println("Purchased Nuts");
                }
                input = scanner.nextLine();
            } else if ("Water".equals(input)) {

                if (totalMoney < 0.7) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 0.7;
                    System.out.println("Purchased Water");
                }
                input = scanner.nextLine();
            } else if ("Crisps".equals(input)) {

                if (totalMoney < 1.5) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 1.5;
                    System.out.println("Purchased Crisps");
                }
                input = scanner.nextLine();
            } else if ("Soda".equals(input)) {

                if (totalMoney < 0.8) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 0.8;
                    System.out.println("Purchased Soda");

                }
                input = scanner.nextLine();
            } else if ("Coke".equals(input)) {

                if (totalMoney < 1.0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 1.0;
                    System.out.println("Purchased Coke");
                }
                input = scanner.nextLine();
            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
            }


        }

        System.out.printf("Change: %.2f", totalMoney);


    }
}
