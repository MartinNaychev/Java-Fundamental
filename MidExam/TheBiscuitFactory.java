package MidExam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competingFactory = Integer.parseInt(scanner.nextLine());

        int totalBiscuits = 0;

        for (int day = 1; day <= 30; day++) {

            int totalBiscuitsPerDay = biscuitsPerDay * workers;

            if (day % 3 == 0) {
                totalBiscuitsPerDay *= 0.75;
                totalBiscuits += totalBiscuitsPerDay;
            } else {
                totalBiscuits += totalBiscuitsPerDay;

            }
        }
        double difference = totalBiscuits - competingFactory;
        double percent = (difference / competingFactory) * 100;

        if (totalBiscuits > competingFactory) {

            System.out.printf("You have produced %d biscuits for the past month.%n", totalBiscuits);
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else {

            System.out.printf("You have produced %d biscuits for the past month.%n", totalBiscuits);
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percent));
        }

    }
}
