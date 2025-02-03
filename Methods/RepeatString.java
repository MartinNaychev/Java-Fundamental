package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        String output = validate(input,repeatCount);

        System.out.println(output);
    }

    private static String validate (String input,int repeatCount){
        String text = "";
        for (int counter = 0; counter < repeatCount; counter++) {
            text +=input;
        }
        return text;
    }

}
