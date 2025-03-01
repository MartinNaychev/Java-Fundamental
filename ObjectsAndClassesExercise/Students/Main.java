package ObjectsAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());

        List<Student>students = new ArrayList<>();

        for (int i = 1; i <=counter ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String secondName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName,secondName,grade);
            students.add(student);
        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getSecondName(),student.getGrade());
        }



    }
}
