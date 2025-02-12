package ExamPreparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialPower = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int wins = 0;

        while (!command.equals("End of battle")) {
            int power = Integer.parseInt(command);

            if (initialPower >= power) {
                initialPower -= power;
                wins++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wins, initialPower);
                return;
            }

            if (wins % 3 == 0) {
                initialPower+=wins;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wins,initialPower);

    }
}
