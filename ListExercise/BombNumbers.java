package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] bombAndPower = scanner.nextLine().split(" ");

        String bomb = bombAndPower[0];
        int power = Integer.parseInt(bombAndPower[1]);

        while (elements.contains(bomb)) {
            int bombIndex = elements.indexOf(bomb);

            int start = bombIndex - power;
            if (start < 0) {
                start = 0;
            }

            int end = bombIndex + power;
            if (end > elements.size() - 1) {
                end = elements.size() - 1;
            }

            for (int i = end; i >= start; i--) {
                elements.remove(i);
            }
        }

        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }

}
