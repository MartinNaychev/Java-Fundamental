package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(" : ");

        while (!input[0].equals("end")) {
            String courseName = input[0];
            String studentName = input[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);
            input = scanner.nextLine().split(" : ");

        }
        for (var entry : courses.entrySet()) {
            String courseName = entry.getKey();
            int studentCount = entry.getValue().size();
            System.out.printf("%s: %d%n",courseName,studentCount);
            List<String>names = entry.getValue();
            for (String name : names) {
                System.out.printf("-- %s%n",name);
            }


        }


    }
}
