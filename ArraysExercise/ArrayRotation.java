package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotation = Integer.parseInt(scanner.nextLine());
        int number = 0;
        for (int currentRotation = 0; currentRotation < rotation ; currentRotation++) {
            number=array[0];

            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];

            }
            array[array.length-1] = number;
        }
        for (int numbers : array) {
            System.out.print(numbers + " ");

        }
    }
}
