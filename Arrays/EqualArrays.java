package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int faultyIndex;
        boolean faultyCounter = true;

        for (int position = 0; position < firstArray.length; position++) {
            int firstArrayNumber = firstArray[position];
            int secondArrayNumber = secondArray[position];
            if (firstArrayNumber == secondArrayNumber) {
                sum += firstArrayNumber;
            } else {
                faultyIndex = position;
                System.out.printf("Arrays are not identical. Found difference at %d index.", faultyIndex);
                faultyCounter = false;
                break;
            }

        }
        if (faultyCounter) {

            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
