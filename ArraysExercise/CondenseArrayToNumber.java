package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condensed = new int[array.length - 1];


        for (int i = 0; i <= array.length - 1; i++) {
            if (array.length - 1 != 0) {

                for (int position = 0; position < array.length - 1; position++) {

                    condensed[position] = array[position] + array[position + 1];
                }
                array = condensed;
            }
        }
        System.out.println(array[0]);
    }
}
