package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> charactersMap = new LinkedHashMap<>();


        for (int i = 0; i < input.length(); i++) {



            char currentSymbol = input.charAt(i);



            if (!charactersMap.containsKey(currentSymbol)){
                charactersMap.put(currentSymbol, 1);
            }else {
                int currentQuant = charactersMap.get(currentSymbol);
                charactersMap.put(currentSymbol, currentQuant+1);

            }

        }

        for (var entry: charactersMap.entrySet()){
            char symbol = entry.getKey();
            int quant = entry.getValue();

            System.out.printf("%c -> %d%n", symbol, quant);

        }


    }
}
