package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destinations = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String operation = command.split(":")[0];
            if (operation.contains("Add")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String stringForInsert = command.split(":")[2];
                if (index >= 0 && index < destinations.length()) {
                    StringBuilder newString = new StringBuilder(destinations);
                    newString.insert(index, stringForInsert);
                    destinations = newString.toString();
                }
                System.out.println(destinations);

            } else if (operation.contains("Remove")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (startIndex >= 0 && endIndex < destinations.length()) {
                    String sb = destinations.substring(startIndex, endIndex+1);
                    destinations = destinations.replaceAll(sb, "");
                }
                System.out.println(destinations);

            } else if (operation.contains("Switch")) {
                String oldString = command.split(":")[1];
                String newString = command.split(":")[2];
                if (destinations.contains(oldString)){

                   destinations = destinations.replace(oldString,newString);

                }
                System.out.println(destinations);

            }

            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + destinations);
    }
}
