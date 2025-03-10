package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordForRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(wordForRemove)){
            input = input.replace(wordForRemove, "");


        }
        System.out.println(input);



    }
}
