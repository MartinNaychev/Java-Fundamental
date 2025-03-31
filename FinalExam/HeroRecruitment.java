package FinalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> heroesAndSpells = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            String heroName = input.split(" ")[1];

            if (command.equals("Enroll")) {
                if (!heroesAndSpells.containsKey(heroName)) {
                    heroesAndSpells.put(heroName, new ArrayList<>());
                } else {
                    System.out.printf("%s is already enrolled.%n", heroName);
                }

            } else if (command.equals("Learn")) {

                String spellName = input.split(" ")[2];

                if (!heroesAndSpells.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else {
                    boolean spellNotExist = validateSpells(spellName, heroesAndSpells.get(heroName));
                    if (spellNotExist) {
                        heroesAndSpells.get(heroName).add(spellName);
                    } else {
                        System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                    }

                }

            } else if (command.equals("Unlearn")) {
                String spellName = input.split(" ")[2];
                if (!heroesAndSpells.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else {
                    boolean spellNotExist = validateSpells(spellName, heroesAndSpells.get(heroName));
                    if (spellNotExist) {
                        System.out.printf("%s doesn't know %s.%n", heroName, spellName);
                    } else {
                        heroesAndSpells.get(heroName).remove(spellName);
                    }

                }

            }

            input = scanner.nextLine();
        }

        System.out.println("Heroes:");
        for (var entry : heroesAndSpells.entrySet()) {
            String heroName = entry.getKey();
            List<String> spells = entry.getValue();
            System.out.printf("== %s: %s%n", heroName, spells.toString().replaceAll("[\\[\\]]", ""));

        }

    }

    private static boolean validateSpells(String spellName, List<String> spells) {

        for (String spell : spells) {
            if (spell.equals(spellName)) {
                return false;
            }

        }

        return true;
    }
}
