package ObjectsAndClasses.Student2;

import ObjectsAndClasses.Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();


        while (!input.equals("end")) {

            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            String hometown = input.split(" ")[3];

            Student student = new Student(firstName, lastName, age, hometown);
            for (Student studentForCheck : studentList) {
                if (!studentForCheck.getFirstName().equals(firstName)){
                    if (!studentForCheck.getLastName().equals(lastName)){
                        studentList.add(student);
                    }
                }

            }
            if (studentList.isEmpty()){
                studentList.add(student);
            }



            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentList) {
            if (city.equals(student.getHometown())){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),student.getAge());
            }

        }


    }

}
