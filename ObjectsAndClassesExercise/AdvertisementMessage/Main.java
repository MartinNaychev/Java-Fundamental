package ObjectsAndClassesExercise.AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input ; i++) {
            String phrases = message.getPhrases();
            String events = message.getEvent();
            String authors = message.getAuthors();
            String cities = message.getCities();

            System.out.printf("%s %s %s – %s%n", phrases,events,authors,cities);

        }



    }
}
