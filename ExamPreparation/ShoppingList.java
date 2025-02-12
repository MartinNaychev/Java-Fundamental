package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceriesList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());


        String input =  scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            String item = input.split(" ")[1];

            if (command.equals("Urgent") && !groceriesList.contains(item)){
                groceriesList.addFirst(item);

            } else if (command.equals("Unnecessary") && groceriesList.contains(item)) {
                groceriesList.remove(item);

            } else if (command.equals("Correct") && groceriesList.contains(item)) {
                int index = groceriesList.indexOf(item);
                String newItem = input.split(" ")[2];
                groceriesList.set(index, newItem);

            } else if (command.equals("Rearrange") && groceriesList.contains(item)) {
                groceriesList.remove(item);
                groceriesList.addLast(item);
            }

            input = scanner.nextLine();
        }

        System.out.println(groceriesList.toString().replaceAll("[\\[\\]]", ""));

    }
}

