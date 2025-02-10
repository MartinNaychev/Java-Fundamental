package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<String> isGoing = new ArrayList<>();

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("is going")) {
                if (isGoing.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    isGoing.add(name);
                }

            } else if (command.contains("is not going")) {

                if (isGoing.contains(name)) {
                    isGoing.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            }
        }
        for (String string : isGoing) {
            System.out.println(string);
        }

    }
}
