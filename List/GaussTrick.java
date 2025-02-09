package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int interaction = numbers.size()/2;
        for (int position = 0; position < interaction; position++) {

            numbers.set(position, numbers.get(position)+numbers.get(numbers.size()-1));
            numbers.removeLast();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
