package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        double bestKeg = 0.00;
        String bestKegName = "";

        for (int i = 0; i < rows; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume>bestKeg){
                bestKeg=volume;
                bestKegName = model;

            }


        }
        System.out.println(bestKegName);


    }
}
