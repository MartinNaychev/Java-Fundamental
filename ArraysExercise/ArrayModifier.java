package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String command = input.split(" ")[0];

            if (command.equals("swap")){
                int firstInput = Integer.parseInt(input.split( " ")[1]);
                int secondInput = Integer.parseInt(input.split( " ")[2]);

                int firstNumber = array[firstInput];
                int secondNumber = array[secondInput];

                array[firstNumber] = secondNumber;
                array[secondInput] = firstNumber;

            }
            if (command.equals("multiply")){
                int firstInput = Integer.parseInt(input.split( " ")[1]);
                int secondInput = Integer.parseInt(input.split( " ")[2]);

                int firstNumber = array[firstInput];
                int secondNumber = array[secondInput];

                array[firstNumber] = secondNumber * firstNumber;


            }
            if (command.equals("decrease")){
                for (int position = 0; position < array.length; position++) {
                    array[position]--;
                }
            }

            input=scanner.nextLine();
        }
        System.out.println();
    }
}
