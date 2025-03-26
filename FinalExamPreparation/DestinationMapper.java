package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([=|\\/])[A-Z][A-Za-z]{2,}\\1");

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int points = 0;
        while (matcher.find()) {

            String destination = matcher.group().replaceAll("[=/]", "");
            destinations.add(destination);
            for (char symbol : destination.toCharArray()) {
                points++;
            }

        }


        System.out.print("Destinations: ");
        System.out.print(destinations.toString().replaceAll("[\\[\\]]", ""));
        System.out.println();
        System.out.println("Travel Points: " + points);




    }
}
