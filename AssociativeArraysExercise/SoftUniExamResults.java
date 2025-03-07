package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> pointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> languageMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")){

            if (input.contains("banned")){
                String name = input.split("-")[0];
                pointsMap.remove(name);
                break;

            }

            String username = input.split("-")[0];
            String language = input.split("-")[1];
            int points = Integer.parseInt(input.split("-")[2]);

            languageMap.putIfAbsent(language,new ArrayList<>());
            languageMap.get(language).add(username);

            boolean isContainUser = validateIsContainUser(pointsMap, username);


            if (!isContainUser){
                pointsMap.put(username,points);
            }else {
                String containedKey = validateKey(pointsMap,username);

                if (pointsMap.get(containedKey)>=points){

                }else {
                    pointsMap.put(containedKey, points);
                }

            }


            input= scanner.nextLine();
        }
        System.out.println("Results:");
        for (var entry : pointsMap.entrySet()){
            String name = entry.getKey();
            int point = entry.getValue();

            System.out.printf("%s | %d%n",name,point);
        }
        System.out.println("Submissions:");
        for (var entry : languageMap.entrySet()){
            String languageName = entry.getKey();
            List<String>names = entry.getValue();
            int count = names.size();

            System.out.printf("%s - %d%n",languageName,count);

        }
    }

    private static boolean validateIsContainUser (LinkedHashMap<String, Integer>pointsMap,String username){
        for (var entry : pointsMap.entrySet()){
            String currentName = entry.getKey();
                if (currentName.equals(username)){
                    return true;
                }
        }
        return false;
    }

    private static String validateKey (LinkedHashMap<String, Integer>pointsMap,String username){
        for (var entry : pointsMap.entrySet()){

            String currentName = entry.getKey();
            if (currentName.equals(username)){
                return entry.getKey();
            }

        }
        return "";
    }
}
