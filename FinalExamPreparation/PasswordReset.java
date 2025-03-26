package FinalExamPreparation;

import java.util.Scanner;

public class   PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();



        String commands = scanner.nextLine();

        while (!commands.equals("Done")) {

            if (commands.equals("TakeOdd")) {
                StringBuilder newPassword = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 == 1){
                        char symbol = input.charAt(i);
                        newPassword.append(symbol);
                    }
                }
                input= String.valueOf(newPassword);
                System.out.println(input);

            } else if (commands.contains("Cut")) {
                int startIndex = Integer.parseInt(commands.split(" ")[1]);
                int length = Integer.parseInt(commands.split(" ")[2]);
                StringBuilder newPassword = new StringBuilder(input);

                for (int i = startIndex+length-1; i >= startIndex; i--) {
                    newPassword.deleteCharAt(i);
                }
                input=String.valueOf(newPassword);
                System.out.println(input);


            } else if (commands.contains("Substitute")) {
                String substring = commands.split(" ")[1];
                String replaceWith = commands.split(" ")[2];
                StringBuilder newPassword = new StringBuilder(input);

                if (input.contains(substring)) {
                    input=input.replace(substring,replaceWith);
                    System.out.println(input);
                }else {
                    System.out.println("Nothing to replace!");
                }

            }

            commands = scanner.nextLine();
        }


        System.out.printf("Your password is: %s",input);

    }
}
