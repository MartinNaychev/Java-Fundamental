package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartsOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        while (end >= start) {
            char symbol = (char) start;
            System.out.print(symbol+" ");

            start++;
        }


    }
}
