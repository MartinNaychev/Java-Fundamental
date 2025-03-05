package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>>gradeMap = new LinkedHashMap<>();

        for (int i = 0; i < counter; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            gradeMap.putIfAbsent(name,new ArrayList<>());
            gradeMap.get(name).add(grade);

        }

        for (var entry : gradeMap.entrySet()){
            String name = entry.getKey();
            double grade = 0.0;
            int currentCounter = 0;
            List<Double>allGrades = entry.getValue();
            for (Double currentGrade : allGrades) {
                grade+=currentGrade;
                currentCounter++;
            }
            double aveGrade = grade/currentCounter;
            if (aveGrade>= 4.50){
                System.out.printf("%s -> %.2f%n",name,aveGrade);
            }

        }

    }
}
