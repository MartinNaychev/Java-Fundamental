package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("3:1")) {
            if (command.startsWith("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > text.size() - 1) {
                    endIndex = text.size() - 1;
                }
                if (startIndex <= text.size() - 1 && endIndex >= 0) {

                    String mergedIndex = "";
                    for (int position = startIndex; position <= endIndex; position++) {
                        String currentPosition = text.get(position);
                        mergedIndex += currentPosition;

                    }

                    for (int position = startIndex; position <= endIndex; position++) {
                        text.remove(startIndex);
                    }
                    text.add(startIndex, mergedIndex);

                }

            } else if (command.startsWith("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= text.size() - 1) {

                    String dividedIndex = text.get(index);
                    text.remove(index);

                    int dividedParts = dividedIndex.length() / partitions;

                    int startIndex = 0;

                    for (int i = 1; i < partitions ; i++) {
                        String textPerParts = dividedIndex.substring(startIndex, startIndex+dividedParts);
                        text.add(index, textPerParts);
                        index++;
                        startIndex+=dividedParts;
                    }

                    String textLastParts = dividedIndex.substring(startIndex, dividedIndex.length());
                    text.add(index, textLastParts);

                }

            }

            command = scanner.nextLine();
        }


        System.out.println(String.join(" ", text));


    }
}
