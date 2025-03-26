package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cityGold = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] parts = input.split("[|]{2}");
            String city = parts[0];
            int population = Integer.parseInt(parts[1]);
            int gold = Integer.parseInt(parts[2]);


            if (cityPopulation.containsKey(city)) {
                int currentPopulation = cityPopulation.get(city);
                int currentGold = cityGold.get(city);

                cityPopulation.put(city, currentPopulation + population);
                cityGold.put(city, currentGold + gold);

            } else {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);
            }

            input = scanner.nextLine();
        }

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] parts = commands.split("=>");
            String command = parts[0];
            String city = parts[1];

            if (command.equals("Plunder")) {

                int peoples = Integer.parseInt(parts[2]);
                int gold = Integer.parseInt(parts[3]);
                int currentPopulation = cityPopulation.get(city);
                int currentGold = cityGold.get(city);

                cityPopulation.put(city, currentPopulation - peoples);
                cityGold.put(city, currentGold - gold);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, peoples);

                if (currentPopulation - peoples == 0 || currentGold - gold == 0) {
                    System.out.printf("%s has been wiped off the map!%n", city);
                    cityPopulation.remove(city);
                    cityGold.remove(city);
                }


            } else if (command.equals("Prosper")) {

                int gold = Integer.parseInt(parts[2]);
                int currentGold = cityGold.get(city);

                if (gold >= 0) {
                    cityGold.put(city, currentGold + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, currentGold + gold);

                } else {
                    System.out.println("Gold added cannot be a negative number!");
                }

            }

            commands = scanner.nextLine();
        }

        if (!cityPopulation.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityPopulation.size());


            for (var entry : cityPopulation.entrySet()) {
                String cityName = entry.getKey();
                int population = entry.getValue();
                int gold = cityGold.get(cityName);

                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", cityName, population, gold);
            }
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
