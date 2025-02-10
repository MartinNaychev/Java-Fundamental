package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.startsWith("Add")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                numbers.add(element);

            } else if (command.startsWith("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size()) {
                    numbers.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.startsWith("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.startsWith("Shift left")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int firstIndex = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstIndex);
                }

            } else if (command.startsWith("Shift right")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int lastIndex = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastIndex);
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
