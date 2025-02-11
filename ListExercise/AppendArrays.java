package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> text = new ArrayList<>(Arrays.stream(input.split("\\|")).toList());

        Collections.reverse(text);

        for (String string : text) {

            if (string.equals("") || string.equals(" ")){
                continue;
            }
            System.out.print(string.trim().replaceAll("\\s+", " ")+ " ");
        }




    }
}

//collect(Collectors.toList())