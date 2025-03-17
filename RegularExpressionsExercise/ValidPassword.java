package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]\\_\\.+";
        Pattern pattern = Pattern.compile(regex);
        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                StringBuilder group = new StringBuilder();
                for (char symbol : input.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        group.append(symbol);
                    }

                }
                if (group.isEmpty()){
                    System.out.println("Group: default");;

                }else {
                    System.out.printf("Group: %s%n",group);;

                }

            }else {
                System.out.println("Invalid pass!");
            }


        }


    }
}
