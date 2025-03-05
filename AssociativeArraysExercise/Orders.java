package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> quantMap = new LinkedHashMap<>();

        while (!input[0].equals("buy")) {
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quant = Integer.parseInt(input[2]);
            priceMap.put(product, price);

            if (quantMap.containsKey(product)) {
                int currentQuant = quantMap.get(product);
                quantMap.put(product, currentQuant + quant);

            }
            quantMap.putIfAbsent(product, quant);
            input = scanner.nextLine().split(" ");
        }

        for (var entry: priceMap.entrySet()){
            double price = entry.getValue();
            int quant = quantMap.get(entry.getKey());
            double totalPrice = price*quant;
            System.out.printf("%s -> %.2f%n", entry.getKey(),totalPrice);

        }

    }
}
