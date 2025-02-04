package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        getMatrix(number);
    }

    public static void getMatrix(int number) {

        for (int j = 0; j < number; j++) {

            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
