package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enterKey = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder key = new StringBuilder(enterKey);

        while (!input.equals("Generate")){

            if (input.contains("Contains")){
                String subString = input.split(">>>")[1];
                if (key.toString().contains(subString)){
                    System.out.printf("%s contains %s%n",key,subString);
                }else {
                    System.out.println("Substring not found!");
                }
                
            } else if (input.contains("Flip")) {
                String command = input.split(">>>")[1];
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex =Integer.parseInt(input.split(">>>")[3]);
                if (command.equals("Upper")){

                    String subString =key.substring(startIndex,endIndex).toUpperCase();
                    key = key.replace(startIndex,endIndex,subString);
                    System.out.println(key);

                } else if (command.equals("Lower")) {
                    String subString =key.substring(startIndex,endIndex).toLowerCase();
                    key = key.replace(startIndex,endIndex,subString);
                    System.out.println(key);

                }

            } else if (input.contains("Slice")) {
                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex =Integer.parseInt(input.split(">>>")[2]);
                String subString ="";
               key=key.replace(startIndex,endIndex,subString);
                System.out.println(key);
                
            }

            input= scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}
