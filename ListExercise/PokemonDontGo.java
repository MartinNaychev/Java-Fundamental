package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumTotal = 0;


        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = numbers.getFirst();
                sumTotal += firstElement;
                numbers.removeFirst();
                int lastElement = numbers.getLast();
                numbers.addFirst(lastElement);
                removedNumber(numbers, firstElement);

            } else if (index > numbers.size() - 1) {
                int lastElement = numbers.getLast();
                sumTotal += lastElement;
                numbers.removeLast();
                int firstElement = numbers.getFirst();
                numbers.addLast(firstElement);

                removedNumber(numbers, lastElement);
            } else {

                int capturedPokemon = numbers.get(index);
                sumTotal += capturedPokemon;
                numbers.remove(index);
                removedNumber(numbers, capturedPokemon);

            }
        }
        System.out.println(sumTotal);
    }

    private static void removedNumber(List<Integer> numbers, int capturedPokemon) {

        for (int currentPosition = 0; currentPosition < numbers.size(); currentPosition++) {

            int elementCurrentPosition = numbers.get(currentPosition);

            if (elementCurrentPosition <= capturedPokemon) {
                elementCurrentPosition += capturedPokemon;
            } else {
                elementCurrentPosition -= capturedPokemon;
            }
            numbers.set(currentPosition, elementCurrentPosition);

        }

    }


}
