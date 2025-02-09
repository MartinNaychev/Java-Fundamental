package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Contains")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                isContainThisIndex(numbers, index);
            } else if (command.equals("Print even")) {
                printEvenNumbers(numbers);
            } else if (command.equals("Print odd")) {
                printOddNumbers(numbers);
            } else if (command.equals("Get sum")) {
                getDigitSum(numbers);
            } else {

                int number = Integer.parseInt(command.split(" ")[2]);
                String condition = command.split(" ")[1];
                validateCondition(numbers, number, condition);
            }

            command = scanner.nextLine();
        }
    }

    private static void validateCondition(List<Integer> numbers, int number, String condition) {

        if (condition.equals("<")) {
            for (Integer i : numbers) {
                if (i < number)
                    System.out.print(i + " ");
            }
        } else if (condition.equals(">")) {
            for (Integer i : numbers) {
                if (i > number)
                    System.out.print(i + " ");
            }
        } else if (condition.equals(">=")) {
            for (Integer i : numbers) {
                if (i >= number)
                    System.out.print(i + " ");
            }
        } else if (condition.equals("<=")) {
            for (Integer i : numbers) {
                if (i <= number)
                    System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    private static void getDigitSum(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }

    private static void printOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        System.out.println(oddNumbers.toString().replaceAll("[\\[\\],]", ""));

    }


    private static void printEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void isContainThisIndex(List<Integer> number, int index) {
        if (number.contains(index)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }
}
