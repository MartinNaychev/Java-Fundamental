package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[n];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length-1; i >=0 ; i--) {

            System.out.print(numbers[i] + " ");

        }



    }
}
