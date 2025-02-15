package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targertsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            int powerValueRadius = Integer.parseInt(input.split(" ")[2]);

            if (command.equals("Shoot")) {
                if (index < targertsList.size() && index >= 0) {
                    int value = targertsList.get(index);
                    value -= powerValueRadius;
                    if (value > 0) {
                        targertsList.set(index, value);
                    } else {
                        targertsList.remove(index);
                    }
                }

            } else if (command.equals("Add")) {
                if (index <= targertsList.size()-1 && index >= 0) {
                    targertsList.add(index, powerValueRadius);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.equals("Strike")) {

                if (index <= targertsList.size() && index >= 0) {
                    int startIndex = index - powerValueRadius;
                    int endIndex = index + powerValueRadius;
                    if (startIndex >= 0 && endIndex <= targertsList.size() - 1) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            targertsList.remove(startIndex);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                } else {
                    System.out.println("Strike missed!");
                }

            }

            input = scanner.nextLine();
        }
        System.out.println(targertsList.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", "|"));


    }

}
