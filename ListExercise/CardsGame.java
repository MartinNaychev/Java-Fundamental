package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDec = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerDec = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstPlayerDec.isEmpty() && !secondPlayerDec.isEmpty()) {

            int firstPlayerPosition = firstPlayerDec.getFirst();
            int secondPlayerPosition = secondPlayerDec.getFirst();

            firstPlayerDec.remove(0);
            secondPlayerDec.remove(0);

            if (firstPlayerPosition > secondPlayerPosition) {
                firstPlayerDec.add(firstPlayerPosition);
                firstPlayerDec.add(secondPlayerPosition);

            } else if (secondPlayerPosition > firstPlayerPosition) {
                secondPlayerDec.add(secondPlayerPosition);
                secondPlayerDec.add(firstPlayerPosition);
            }
        }
        if (!firstPlayerDec.isEmpty()) {

            int sum = firstPlayerDec.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d", sum);

        } else if (!secondPlayerDec.isEmpty()) {

            int sum = secondPlayerDec.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        }


    }
}


