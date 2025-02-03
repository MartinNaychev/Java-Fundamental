package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        validate(product, quantity);

    }

    private static void validate(String product, int quantity) {
        switch (product){
            case "coffee" -> System.out.printf("%.2f",quantity*1.50);
            case "water" -> System.out.printf("%.2f",quantity*1.00);
            case "coke" -> System.out.printf("%.2f",quantity*1.40);
            case "snacks" -> System.out.printf("%.2f",quantity*2.00);

        }
        
    }
}