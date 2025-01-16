package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int total = 0;
        while (startNumber <= endNumber) {
            System.out.print(startNumber);
            System.out.print(" ");
            total +=startNumber;
            startNumber++;


        }

        System.out.println();
        System.out.printf("Sum: %d", total);

    }
}
