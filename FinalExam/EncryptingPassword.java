package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(\\S+)>(?<numbers>[0-9]{3})[|](?<lower>[a-z]{3})[|](?<upper>[A-Z]{3})[|](?<symbols>[^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < counter; i++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()){
                String numbers = matcher.group("numbers");
                String lower = matcher.group("lower");
                String upper = matcher.group("upper");
                String symbols = matcher.group("symbols");
                System.out.println("Password: " + numbers+lower+upper+symbols);

            }else {
                System.out.println("Try another password!");
            }

        }

    }
}
