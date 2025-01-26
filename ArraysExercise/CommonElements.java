package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        String result = "";

        for (int position = 0; position < secondArray.length; position++) {
            String secondArraySymbol = secondArray [position];

            for (int i = 0; i < firstArray.length; i++) {
                String firstArraySymbol = firstArray [i];
                if (firstArraySymbol.equals(secondArraySymbol)){
                    result+= secondArraySymbol + " ";
                }
            }

        }
        System.out.println(result);



    }
}
