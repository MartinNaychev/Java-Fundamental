package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = Integer.parseInt(scanner.nextLine());
        double total = 0.00;

        for (int i = 0; i < order; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsCount = Integer.parseInt(scanner.nextLine());

            double totalPerOrder = (days * capsCount) * price;

            System.out.printf("The price for the coffee is: $%.2f%n",totalPerOrder);

            total+=totalPerOrder;


        }
        System.out.printf("Total: $%.2f",total);



    }
}
