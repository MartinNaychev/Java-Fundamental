package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                numbers.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.contains("RemoveAt")) {
                numbers.remove(Integer.parseInt(command.split(" ")[1]));

            } else if (command.contains("Remove")) {
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numberToRemove));

            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                int numberForInsert = Integer.parseInt(command.split(" ")[1]);

                numbers.add(index, numberForInsert);
            }

            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
