package ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Catalog> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);
            if (type.equals("car")) {
                type = "Car";
            } else if (type.equals("truck")) {
                type = "Truck";
            }

            Catalog vehicle = new Catalog(type, model, color, horsepower);
            vehicles.add(vehicle);


            input = scanner.nextLine();
        }

        String model = scanner.nextLine();

        while (!model.equals("Close the Catalogue")) {
            for (Catalog vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println("Type: " + vehicle.getType());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsepower());
                }
            }

            model = scanner.nextLine();
        }

        double averageCarHorsepower = averageHorsepower(vehicles, "Car");
        double averageTruckHorsepower = averageHorsepower(vehicles, "Truck");

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsepower);

    }

    private static double averageHorsepower(List<Catalog> vehicles, String type) {
        int counter = 0;
        double averageSum = 0;
        for (Catalog vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                counter++;
                averageSum += vehicle.getHorsepower();
            }
        }
        if (counter == 0 || averageSum == 0) {
            return 0;
        }

        return averageSum / counter;
    }
}
