package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String operation = command.split(" - ")[0];
            String item = command.split(" - ")[1];
            String firstForCombine = item.split( ":")[0];


            if (operation.equals("Collect") && !itemsList.contains(item)) {
                itemsList.add(item);
            } else if (operation.equals("Drop")&& itemsList.contains(item)) {
                itemsList.remove(item);
            } else if (operation.equals("Combine Items") && itemsList.contains(firstForCombine)) {
                String secondForCombine = item.split( ":")[1];
                int itemIndex = itemsList.indexOf(firstForCombine);
                itemsList.add(itemIndex+1, secondForCombine);
            } else if (operation.equals("Renew") && itemsList.contains(item)) {
                itemsList.remove(item);
                itemsList.add(item);
            }

            command = scanner.nextLine();
        }
        System.out.println(itemsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
