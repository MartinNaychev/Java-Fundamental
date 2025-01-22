package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTank = 255;
        int lines = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;

        for (int i = 0; i < lines; i++) {
            int litersIn = Integer.parseInt(scanner.nextLine());
            totalLiters +=litersIn;

            if (totalLiters>waterTank){
                System.out.println("Insufficient capacity!");
                totalLiters-=litersIn;
            }
        }
        System.out.println(totalLiters);


    }
}
