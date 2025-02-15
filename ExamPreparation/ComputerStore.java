package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double sum = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double inputNumber = Double.parseDouble(input);

            if (inputNumber >= 0) {
                sum += inputNumber;

            } else {
                System.out.println("Invalid price!");
            }
            input = scanner.nextLine();
        }

        if (sum <= 0) {
            System.out.println("Invalid order!");
            return;
        }
        double sumWithTaxes = sum * 1.2;
        double taxes = sumWithTaxes - sum;

        if (input.equals("special")) {
            sumWithTaxes *= 0.9;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", sum);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", sumWithTaxes);


    }
}
