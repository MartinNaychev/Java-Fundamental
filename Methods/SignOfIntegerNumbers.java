package Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        ValidateNumber(number);
    }

    private static void ValidateNumber (Integer number){

        if (number>0){
            System.out.printf("The number %d is positive.",number);
        } else if (number==0) {
            System.out.printf("The number %d is zero.",number);
        }else
            System.out.printf("The number %d is negative.",number);
    }
}
