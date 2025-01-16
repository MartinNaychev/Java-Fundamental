package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int total = 0;

        for (int i = 1; i <= input; i++) {
            System.out.println(number);
            total +=number;
            number += 2;


        }
        System.out.printf("Sum: %d", total);

    }
}
