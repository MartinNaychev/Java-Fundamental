package AssociativeArraysExercise;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int quant = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (materials.containsKey(material)) {
                    int currentQuant = materials.get(material);
                    materials.put(material, currentQuant + quant);
                    if (materials.get(material) >= 250) {
                        if (material.equals("shards")) {
                            materials.put(material, materials.get(material) - 250);
                            System.out.println("Shadowmourne obtained!");
                            isObtained = true;
                        } else if (material.equals("fragments")) {
                            materials.put(material, materials.get(material) - 250);
                            System.out.println("Valanyr obtained!");
                            isObtained = true;
                        } else if (material.equals("motes")) {
                            materials.put(material, materials.get(material) - 250);
                            System.out.println("Dragonwrath obtained!");
                            isObtained = true;
                        }
                        if(isObtained){
                            break;
                        }
                    }
                }


                materials.putIfAbsent(material, quant);
            }

        }

        for (var entry : materials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
