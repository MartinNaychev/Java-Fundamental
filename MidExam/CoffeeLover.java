package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int counter = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= counter; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];


            if (command.equals("Include")) {
                String coffeeForAdd = input.split(" ")[1];
                coffeeList.addLast(coffeeForAdd);


            } else if (command.equals("Remove")) {
                String side = input.split(" ")[1];
                int howManyToRemove = Integer.parseInt(input.split(" ")[2]);

                if (howManyToRemove <= coffeeList.size()) {                   // не знам дали не трябва да е coffee size -1
                    if (side.equals("first")) {
                        for (int j = 0; j < howManyToRemove; j++) {
                            coffeeList.removeFirst();
                        }
                    } else {
                        for (int j = 0; j < howManyToRemove; j++) {
                            coffeeList.removeLast();
                        }
                    }
                }

            } else if (command.equals("Prefer")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                if (firstIndex >= 0 && firstIndex < coffeeList.size() && secondIndex >= 0 && secondIndex < coffeeList.size()) {
                    String firstCoffee = coffeeList.get(firstIndex);
                    String secondCoffee = coffeeList.get(secondIndex);

                    coffeeList.set(firstIndex, secondCoffee);
                    coffeeList.set(secondIndex, firstCoffee);

                }

            } else if (command.equals("Reverse")) {

                Collections.reverse(coffeeList);

            }

        }

        System.out.println("Coffees:");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]", ""));


    }
}
