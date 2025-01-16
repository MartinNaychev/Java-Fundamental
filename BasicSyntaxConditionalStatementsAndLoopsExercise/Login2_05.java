package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String username = scanner.nextLine();
        String type = scanner.nextLine();
        String password = "";


        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        int i = 1;
        while (!password.equals(type)) {
            if (i >=4) {
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            type = scanner.nextLine();
            i++;



        }
        System.out.printf("User %s logged in.", username);


    }
}
