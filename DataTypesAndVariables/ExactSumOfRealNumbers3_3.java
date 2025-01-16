package DataTypesAndVariables;

import java.util.Scanner;

public class ExactSumOfRealNumbers3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        double count = 0.00;

        for (int i = 0; i < input; i++) {
            double countTo = Double.parseDouble(scanner.nextLine());
            count+=countTo;
        }



        System.out.println(count);






    }
}
