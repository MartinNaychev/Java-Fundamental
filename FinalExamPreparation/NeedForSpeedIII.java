package FinalExamPreparation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Integer>> cars = new LinkedHashMap<>();

        int carsNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsNumbers; i++) {
            String carsInput = scanner.nextLine();
            String carBrand = carsInput.split("\\|")[0];
            int initialMileage = Integer.parseInt(carsInput.split("\\|")[1]);
            int initialFuel = Integer.parseInt(carsInput.split("\\|")[2]);

            cars.putIfAbsent(carBrand, new ArrayList<>());
            cars.get(carBrand).add(initialMileage);
            cars.get(carBrand).add(initialFuel);

        }

        String commands = scanner.nextLine();

        while (!commands.equals("Stop")) {

            if (commands.contains("Drive")) {
                String car = commands.split(" : ")[1];
                int distance = Integer.parseInt(commands.split(" : ")[2]);
                int fuel = Integer.parseInt(commands.split(" : ")[3]);
                boolean enoughFuel = validateFuel(fuel, cars.get(car));
                if (!enoughFuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int currentMileage = cars.get(car).getFirst();
                    int currentFuel = cars.get(car).getLast();
                    int newMileage = distance + currentMileage;
                    int newFuel = currentFuel - fuel;
                    cars.get(car).set(1, newFuel);
                    cars.get(car).set(0, newMileage);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);

                    if (newMileage >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        cars.remove(car);
                    }

                }

            } else if (commands.contains("Refuel")) {
                String car = commands.split(" : ")[1];
                int givenFuel = Integer.parseInt(commands.split(" : ")[2]);
                int currentFuel = cars.get(car).getLast();
                int enteredFuel = 0;
                if ((givenFuel + currentFuel) > 75) {
                    enteredFuel = 75 - currentFuel;
                    cars.get(car).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", car, enteredFuel);

                } else {
                    enteredFuel = givenFuel + currentFuel;
                    cars.get(car).set(1, enteredFuel);
                    System.out.printf("%s refueled with %d liters%n", car, givenFuel);
                }

            } else if (commands.contains("Revert")) {
                String car = commands.split(" : ")[1];
                int kilometers = Integer.parseInt(commands.split(" : ")[2]);
                int currentMileage = cars.get(car).getFirst();
                int newMileage = currentMileage - kilometers;

                if (newMileage < 10000) {
                    cars.get(car).set(0, 10000);
                } else {
                    cars.get(car).set(0, newMileage);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                }

            }
            commands = scanner.nextLine();

        }

        for (var entry : cars.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue().getFirst();
            int fuel = entry.getValue().getLast();


            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car, mileage, fuel);
        }

    }

    private static boolean validateFuel(int fuel, List<Integer> distanceAndFuel) {
        int currentFuel = distanceAndFuel.getLast();
        if (fuel > currentFuel) {
            return false;
        }
        return true;
    }


}
