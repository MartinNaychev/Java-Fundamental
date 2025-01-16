package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enteredNumber = scanner.nextLine();

        String number = "";
        int parsNumber = 0;
        int totalParsNumber = 1;
        int total=0;

        for (int i = enteredNumber.length() - 1; i >= 0; i--) {

            number += enteredNumber.charAt(i);

            parsNumber = Integer.parseInt(number);
            totalParsNumber = parsNumber;

            for (int j = parsNumber; j >1; j--) {

                totalParsNumber = totalParsNumber * (j - 1);

            }
            total+=totalParsNumber;
            number = "";

        }
        int asd = Integer.parseInt(enteredNumber);


        if (total == asd) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
