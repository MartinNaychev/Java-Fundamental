package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean availableSpace = true;

        for (int cabin = 0; cabin <= array.length - 1; cabin++) {
            int currentCabin = array[cabin];


            while (currentCabin < 4 && people > 0) {
                currentCabin++;
                people--;
            }
            array[cabin] = currentCabin;

            if (currentCabin == 4) {
                availableSpace = false;
            } else {
                availableSpace = true;
            }
        }

        if (availableSpace) {
            System.out.println("The lift has empty spots!");
            for (int cabin : array) {
                System.out.print(cabin + " ");
            }
        } else if (people == 0) {
            for (int cabin : array) {
                System.out.print(cabin + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %s people in a queue!%n", people);
            for (int cabin : array) {
                System.out.print(cabin + " ");
            }
        }
    }
}
