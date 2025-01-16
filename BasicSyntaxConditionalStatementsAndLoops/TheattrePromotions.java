package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheattrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (age >= 0 && age <= 18 ){
            switch (day){
                case "Weekday" -> price = 12;
                case "Weekend" -> price = 15;
                case "Holiday" -> price = 5;
            }
        }else if (age > 18 && age <= 64 ){
            switch (day){
                case "Weekday" -> price = 18;
                case "Weekend" -> price = 20;
                case "Holiday" -> price = 12;
            }
        }else if (age > 64 && age <= 122 ){
            switch (day){
                case "Weekday" -> price = 12;
                case "Weekend" -> price = 15;
                case "Holiday" -> price = 10;
            }
        }else {
            System.out.println("Error!");
            return;
        }


        System.out.printf("%d$",price);

    }
}
