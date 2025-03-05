package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String,Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)){
                int currentQuantity = resources.get(input);
                resources.put(input, currentQuantity+quantity);
            }
            resources.putIfAbsent(input,quantity);

            input= scanner.nextLine();
        }

        for (var entry : resources.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
