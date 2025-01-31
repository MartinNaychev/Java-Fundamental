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

               array[firstInput] = secondNumber;
               array[secondInput] = firstNumber;

            }else if (command.equals("multiply")){
                int firstInput = Integer.parseInt(input.split( " ")[1]);
                int secondInput = Integer.parseInt(input.split( " ")[2]);

                int firstNumber = array[firstInput];
                int secondNumber = array[secondInput];

                array[firstInput] = secondNumber * firstNumber;

            }else if (command.equals("decrease")){
                for (int position = 0; position < array.length; position++) {
                    array[position]--;
                }
            }

            input=scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {

            if (i<array.length-1){
                System.out.print(array[i] + ", ");
            }else {
                System.out.print(array[i]);
            }
        }

    }
}
