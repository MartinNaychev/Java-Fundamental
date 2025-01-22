package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaust = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int firstPower = power;


        while (power>=distance){

            power-=distance;
            counter++;
            if (power == firstPower/2 && exhaust!=0){
                power/=exhaust;
            }

        }

        System.out.printf("%d%n%d",power,counter);

    }
}
