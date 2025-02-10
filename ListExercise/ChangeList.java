package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            int element = Integer.parseInt(command.split( " ")[1]);
            if (command.startsWith("Delete")){
                numbers.removeAll(List.of(element));
            }else {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }
            command= scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
