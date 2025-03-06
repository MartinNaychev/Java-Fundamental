package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>>sides = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){

            if (input.contains(" | ")){
                String team = input.split( " \\| ")[0];
                String user = input.split( " \\| ")[1];

                sides.putIfAbsent(team,new ArrayList<>());

               boolean isContainUser = validateIsContainUser(sides, user);


                if (!isContainUser){
                    sides.get(team).add(user);
                }

            } else if (input.contains(" -> ")) {
                String user = input.split( " -> ")[0];
                String team = input.split( " -> ")[1];

                boolean isContainUser = validateIsContainUser(sides, user);
                String containedKey = validateKey(sides,user);

                sides.putIfAbsent(team,new ArrayList<>());

                if (!isContainUser){
                    sides.get(team).add(user);
                    System.out.printf("%s joins the %s side!%n",user,team);
                }else {
                    sides.get(containedKey).remove(user);
                    sides.get(team).add(user);
                    System.out.printf("%s joins the %s side!%n",user,team);

                }

            }

            input= scanner.nextLine();
        }

        for (var entry : sides.entrySet()){
            String team = entry.getKey();
            List<String>users = entry.getValue();
            int membersCount = users.size();
            if (!users.isEmpty()){
                System.out.printf("Side: %s, Members: %d%n",team,membersCount);
                for (String user : users) {
                    System.out.printf("! %s%n",user);
                }

            }
        }

    }

    private static boolean validateIsContainUser (LinkedHashMap<String, List<String>>sides,String user){
        for (var entry: sides.entrySet()){
            //String currentTeam = entry.getKey();
            List<String>currentUsers = entry.getValue();
            for (String member : currentUsers) {
                if (member.equals(user)){
                    return true;
                }

            }
        }
        return false;
    }

    private static String validateKey (LinkedHashMap<String, List<String>>sides,String user){
        for (var entry: sides.entrySet()){
            //String currentTeam = entry.getKey();
            List<String>currentUsers = entry.getValue();
            for (String member : currentUsers) {
                if (member.equals(user)){
                    return entry.getKey();
                }

            }
        }
        return "";
    }



}
