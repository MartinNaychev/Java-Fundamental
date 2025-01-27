package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int position = 0; position < array.length; position++) {
            for (int next = position + 1; next < array.length; next++) {
                int sum = array[position] + array[next];
                if (sum == magicNumber) {
                    System.out.println(array[position] + " " + array[next]);

                }
            }


        }


    }
}
