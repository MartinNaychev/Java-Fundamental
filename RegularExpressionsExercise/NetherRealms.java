package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replace(" ", "").split(",");

        for (String word : input) {
            int health = validateHealth(word);
            double dmg = validateDmg(word);

            for (char symbol : word.toCharArray()) {
                if (symbol=='*'){
                    dmg *=2;
                } else if (symbol=='/') {
                    dmg/=2;

                }

            }
            System.out.printf("%s - %d health, %.2f damage%n",word,health,dmg);

        }

    }

    private static double validateDmg(String word) {
        double dmg = 0.00;

        String regex = "-?[\\d]+\\.?[\\d]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()){
            dmg +=Double.parseDouble(matcher.group());
        }


        return dmg;
    }

    private static int validateHealth(String word) {
        int health = 0;

            for (char symbol : word.toCharArray()) {
                if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/' && symbol != '.' && !Character.isDigit(symbol)) {
                    health += symbol;

                }
            }


        return health;
    }
}
