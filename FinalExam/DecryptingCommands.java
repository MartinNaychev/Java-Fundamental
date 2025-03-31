package FinalExam;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Finish")) {
            String[] partsOfCommands = commands.split(" ");
            String command = partsOfCommands[0];


            if (command.equals("Replace")) {
                char currentChar = partsOfCommands[1].charAt(0);
                String newChar = partsOfCommands[2];
                input = input.replaceAll(String.valueOf(currentChar), newChar);
                System.out.println(input);

            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(partsOfCommands[1]);
                int endIndex = Integer.parseInt(partsOfCommands[2]);

                if (startIndex < 0 || endIndex > input.length() - 1) {
                    System.out.println("Invalid indices!");
                } else {
                    String sb = input.substring(startIndex, endIndex + 1);
                    input = input.replace(sb, "");
                    System.out.println(input);
                }

            } else if (command.equals("Make")) {
                String upOrLow = partsOfCommands[1];

                if (upOrLow.equals("Upper")) {
                    input = input.toUpperCase();
                } else {
                    input = input.toLowerCase();
                }
                System.out.println(input);

            } else if (command.equals("Check")) {
                String checkForString = partsOfCommands[1];
                if (input.contains(checkForString)) {
                    System.out.printf("Message contains %s%n", checkForString);
                } else {
                    System.out.printf("Message doesn't contain %s%n", checkForString);
                }

            } else if (command.equals("Sum")) {
                int startIndex = Integer.parseInt(partsOfCommands[1]);
                int endIndex = Integer.parseInt(partsOfCommands[2]);
                if (startIndex < 0 || endIndex > input.length() - 1) {
                    System.out.println("Invalid indices!");
                } else {
                    String sb = input.substring(startIndex, endIndex + 1);
                    int sum = 0;
                    for (char symbol : sb.toCharArray()) {
                        sum += symbol;
                    }

                    System.out.println(sum);
                }

            }

            commands = scanner.nextLine();
        }
    }
}
