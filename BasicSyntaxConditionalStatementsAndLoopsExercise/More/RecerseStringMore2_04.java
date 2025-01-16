package BasicSyntaxConditionalStatementsAndLoopsExercise.More;

import java.util.Scanner;

public class RecerseStringMore2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String symbol = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            symbol += input.charAt(i);
        }
        System.out.print(symbol);



    }
}
