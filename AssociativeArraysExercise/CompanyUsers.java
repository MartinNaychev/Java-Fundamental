package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();

        String input = scanner.nextLine();
        boolean isContain = false;

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            companies.putIfAbsent(company, new ArrayList<>());


            List<String> allId = companies.get(company);
            for (String currentId : allId) {
                if (currentId.equals(id)) {
                    isContain = true;
                }

            }


            if (!isContain) {
                companies.get(company).add(id);

            }
            isContain = false;
            input = scanner.nextLine();
        }

        for (var entry : companies.entrySet()) {
            String name = entry.getKey();
            System.out.println(name);
            List<String> allId = entry.getValue();
            for (String id : allId) {
                System.out.printf("-- %s%n", id);
            }

        }

    }
}
