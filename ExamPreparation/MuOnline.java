package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitCoins = 0;
        List<String> dungeonsList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        for (int roomIndex = 0; roomIndex < dungeonsList.size(); roomIndex++) {
            String room = dungeonsList.get(roomIndex);
            String roomCommand = room.split(" ")[0];
            int value = Integer.parseInt(room.split(" ")[1]);

            if (roomCommand.equals("potion")) {
                initialHealth += value;

                if (initialHealth > 100) {
                    initialHealth -= 100;
                    value -= initialHealth;
                    initialHealth = 100;
                }
                System.out.printf("You healed for %d hp.%n", value);
                System.out.printf("Current health: %d hp.%n", initialHealth);

            } else if (roomCommand.equals("chest")) {
                initialBitCoins += value;
                System.out.printf("You found %d bitcoins.%n", value);

            } else {
                initialHealth -= value;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", roomCommand);
                } else {
                    System.out.printf("You died! Killed by %s.%n", roomCommand);
                    System.out.printf("Best room: %d%n", roomIndex + 1);
                    return;
                }

            }

        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", initialBitCoins);
        System.out.printf("Health: %d%n", initialHealth);

    }
}
