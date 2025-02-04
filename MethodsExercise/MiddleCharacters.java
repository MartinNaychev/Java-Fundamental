package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getMiddleCharacters(input);

    }
    private static void getMiddleCharacters(String input){
        if (input.length()%2 == 1){
            System.out.println(input.charAt(input.length()/2));
        }else {
            System.out.println(input.charAt((input.length()-1)/2) +"" + input.charAt(input.length()/2));
        }

    }
}
