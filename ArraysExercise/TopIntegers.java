package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int currentNumber = 0; currentNumber <= array.length - 1; currentNumber++) {
            boolean counter = true;
            int number = array[currentNumber];

            for (int position = currentNumber + 1; position <= array.length - 1; position++) {

                int positionNumber = array[position];

                if (number <= positionNumber) {
                    counter = false;
                    break;
                }
            }
            if (counter) {
                System.out.print(number + " ");
            }
        }

    }
}
