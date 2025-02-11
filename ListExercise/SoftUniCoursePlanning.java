package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String lessonTitle = command.split(":")[1];

            if (itsNotExist(schedule, lessonTitle)) {

                if (command.startsWith("Add")) {
                    schedule.addLast(lessonTitle);
                } else if (command.startsWith("Insert")) {
                    int index = Integer.parseInt(command.split(":")[2]);
                    schedule.add(index, lessonTitle);
                } else if (command.startsWith("Exercise")) {
                    schedule.add(lessonTitle);
                    schedule.add(lessonTitle + "-Exercise");
                }

            } else {

                if (command.startsWith("Remove")) {
                    schedule.remove(lessonTitle);

                } else if (command.startsWith("Exercise")) {
                    int lessonIndex = schedule.indexOf(lessonTitle);
                    schedule.add(lessonIndex + 1, lessonTitle + "-Exercise");
                } else if (command.startsWith("Swap")) {

                    String titleForSwap = command.split(":")[2];

                    if (!itsNotExist(schedule, titleForSwap)) {
                        int firstPosition = schedule.indexOf(lessonTitle);
                        int secondPosition = schedule.indexOf(titleForSwap);

                        schedule.set(firstPosition, titleForSwap);
                        schedule.set(secondPosition, lessonTitle);

                        String firstExercise = lessonTitle + "-Exercise";
                        String secondExercise = titleForSwap + "-Exercise";

                        if (schedule.contains(firstExercise)) {
                            schedule.remove(firstExercise);
                            schedule.add(secondPosition + 1, firstExercise);

                        } else if (schedule.contains(secondExercise)) {
                            schedule.remove(secondExercise);
                            schedule.add(firstPosition + 1, secondExercise);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        int counter = 1;
        for (String position : schedule) {
            System.out.printf("%d.%s%n", counter, position);
            counter++;
        }
    }

    private static boolean itsNotExist(List<String> list, String title) {
        for (String existing : list) {
            if (existing.contains(title)) {
                return false;
            }
        }
        return true;
    }
}


