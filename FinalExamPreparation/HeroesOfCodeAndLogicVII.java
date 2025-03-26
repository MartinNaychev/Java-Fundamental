package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> heroHP = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroMP = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String heroName = input[0];
            int health = Integer.parseInt(input[1]);
            int mana = Integer.parseInt(input[2]);
            heroHP.put(heroName, health);
            heroMP.put(heroName, mana);
        }

        String command = scanner.nextLine();

        while (!command.contains("End")) {
            String[] parts = command.split(" - ");
            String operation = parts[0];
            String heroName = parts[1];

            if (operation.equals("CastSpell")) {
                int neededMana = Integer.parseInt(parts[2]);
                String spellName = parts[3];
                int currentMana = heroMP.get(heroName);

                if (neededMana <= currentMana) {
                    currentMana -= neededMana;
                    heroMP.put(heroName, currentMana);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMana);

                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }


            } else if (operation.equals("TakeDamage")) {
                int damage = Integer.parseInt(parts[2]);
                String attacker = parts[3];

                int currentHp = heroHP.get(heroName);

                if (damage < currentHp) {
                    int currentHP = heroHP.get(heroName);
                    currentHP-=damage;
                    heroHP.put(heroName,currentHP);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,currentHP);

                } else {
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroHP.remove(heroName);
                    heroMP.remove(heroName);
                }


            } else if (operation.equals("Recharge")) {
                int rechargeMana = Integer.parseInt(parts[2]);
                int currentMana = heroMP.get(heroName);

                if (currentMana+rechargeMana<=200){
                    heroMP.put(heroName,currentMana+rechargeMana);
                    System.out.printf("%s recharged for %d MP!%n",heroName,rechargeMana);
                }else {

                    int neededToRecharge = 200-currentMana;
                    heroMP.put(heroName,200);
                    System.out.printf("%s recharged for %d MP!%n",heroName,neededToRecharge);

                }

            } else if (operation.equals("Heal")) {
                int heal = Integer.parseInt(parts[2]);
                int currentHealth = heroHP.get(heroName);

                if (heal+ currentHealth<=100){
                    heroHP.put(heroName,heal+currentHealth);
                    System.out.printf("%s healed for %d HP!%n", heroName, heal);

                }else {
                    int neededToHeal = 100-currentHealth;
                    heroHP.put(heroName,100);
                    System.out.printf("%s healed for %d HP!%n", heroName, neededToHeal);

                }

            }


            command = scanner.nextLine();
        }

        for (var entry : heroHP.entrySet()){
            String heroName = entry.getKey();
            int health = entry.getValue();
            int mana = heroMP.get(heroName);
            System.out.println(heroName);
            System.out.printf("  HP: %d%n",health);
            System.out.printf("  MP: %d%n",mana);


        }


    }
}
