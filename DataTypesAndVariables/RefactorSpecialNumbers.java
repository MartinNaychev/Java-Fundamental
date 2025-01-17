package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            int number = i;
            int specialNum = 0;

            while (i > 0) {

                specialNum += i % 10;
                i = i / 10;
            }

            boolean isSpecialNum =
                    (specialNum == 5) ||
                    (specialNum == 7) ||
                    (specialNum == 11);

            if (isSpecialNum==true){
                System.out.printf("%d -> True%n", number);

            }else {
                System.out.printf("%d -> False%n", number);

            }

            i = number;


        }
    }
}
