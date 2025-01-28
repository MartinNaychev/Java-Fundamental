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

        for (int position = 0; position < array.length; position++) {
            if (array[position] == 0) {
                if (people >= 4) {
                    array[position] = 4;
                    people -= 4;
                } else if (people > 0) {
                    array[position] = people;
                    people = 0;
                }
            } else {
                if (people >= 3) {
                    int freeSpace = 4 - array[position];
                    people -= freeSpace;
                    array[position] += freeSpace;
                } else {
                    array[position] += people;
                    people = 0;
                }
            }

        }

        if (people == 0 && array[array.length - 1] < 4) {
            System.out.println("The lift has empty spots!");
            for (int wagons : array) {
                System.out.print(wagons + " ");
            }
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int wagons : array) {
                System.out.print(wagons + " ");
            }
        } else {
            for (int wagons : array) {
                System.out.print(wagons + " ");
            }
        }
    }
}
