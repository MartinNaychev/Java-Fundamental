package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scanner.nextLine().toLowerCase().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int quant = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (materials.containsKey(material)) {
                    int currentQuant = materials.get(material);
                    materials.put(material, currentQuant + quant);
                }
                materials.putIfAbsent(material, quant);

                int totalQuant = materials.get(material);

                if (totalQuant >= 250) {
                    if (material.equals("shards")) {
                        System.out.println("Shadowmourne obtained!");
                        isObtained = true;
                    } else if (material.equals("fragments")) {
                        System.out.println("Valanyr obtained!");
                        isObtained = true;
                    } else if (material.equals("motes")) {
                        System.out.println("Dragonwrath obtained!");
                        isObtained = true;
                    }

                }
                if (isObtained){
                    materials.put(material, totalQuant - 250);
                    break;
                }
            }
        }

        for (var entry : materials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
