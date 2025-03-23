package FinalExamPreparation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> plantsRarity = new LinkedHashMap<>();
        LinkedHashMap<String, List<Integer>> plantsRating = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantsRarity.put(plant, rarity);
            plantsRating.putIfAbsent(plant, new ArrayList<>());

        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String plant = command.split(" ")[1];
            if (plantsRating.containsKey(plant)) {
                if (command.contains("Rate")) {
                    Integer rating = Integer.parseInt(command.split(" - ")[1]);
                    plantsRating.get(plant).add(rating);

                } else if (command.contains("Update")) {
                    Integer newRarity = Integer.parseInt(command.split(" - ")[1]);
                    plantsRarity.put(plant, newRarity);

                } else if (command.contains("Reset")) {
                    plantsRating.get(plant).clear();

                }


            } else {
                System.out.println("error");
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        for (var entry : plantsRarity.entrySet()) {
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            List<Integer> allRating = plantsRating.get(plantName);
            double sumRating = 0.00;
            int counter = 0;
            for (Integer rating : allRating) {
                sumRating += rating;
                counter++;
            }
            double aveRating = 0.00;
            if (sumRating>0){
                aveRating = sumRating/counter;
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, aveRating);


        }

    }
}
