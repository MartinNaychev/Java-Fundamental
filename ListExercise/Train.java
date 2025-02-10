package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.startsWith("Add")) {
                wagons.add(Integer.parseInt(input.split(" ")[1]));
            } else {
                int people = Integer.parseInt(input);

                for (int wagon = 0; wagon < wagons.size(); wagon++) {
                    int wagonCapacity = wagons.get(wagon);

                    if (wagonCapacity + people <= maxCapacity) {

                        wagons.set(wagon, wagonCapacity + people);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
