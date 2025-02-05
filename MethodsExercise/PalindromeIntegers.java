package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")){
            validatePalindrome(input);

            input = scanner.nextLine();
        }
    }

    private static void validatePalindrome (String input){
        String reverse = "";

        for (int position = input.length()-1; position >=0 ; position--) {

            reverse += input.charAt(position);
        }
        if (reverse.equals(input)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
