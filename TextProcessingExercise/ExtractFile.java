package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");
        String[] lastElement = input[input.length-1].split("\\.");
        String name = lastElement[0];
        String extension = lastElement[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);


    }
}
