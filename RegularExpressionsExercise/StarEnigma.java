package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)";


        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();


        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();
            int decryptionKey = validateDecryptionKey(input);
            StringBuilder decryptedMessage = new StringBuilder();
            for (char symbol : input.toCharArray()) {
                symbol = (char) (symbol - decryptionKey);
                decryptedMessage.append(symbol);
            }
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planet");
                String type = matcher.group("type");

                if (type.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }

            }

        }

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        if (!attackedPlanets.isEmpty()) {
            Collections.sort(attackedPlanets);
            for (String planet : attackedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        if (!destroyedPlanets.isEmpty()) {
            Collections.sort(destroyedPlanets);
            for (String planet : destroyedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }


    }

    private static int validateDecryptionKey(String input) {
        int key = 0;
        for (char symbol : input.toLowerCase().toCharArray()) {
            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                key++;
            }

        }

        return key;
    }


}
