package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < textArray.length ; i++) {
            int random = rnd.nextInt(textArray.length);
            System.out.println(textArray[random]);
        }

    }
}
