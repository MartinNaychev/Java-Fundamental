package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.00;

        if ("Students".equals(typeOfGroup)){
            if ("Friday".equals(dayOfWeek)){
                price = people * 8.45;
            } else if ("Saturday".equals(dayOfWeek)) {
                price = people * 9.80;
            }else {
                price = people * 10.46;
            }
            if (people >=30){
                price *= 0.85;
            }

        }
        if ("Business".equals(typeOfGroup)){
            if (people >=100){
                people -=10;
            }
            if ("Friday".equals(dayOfWeek)){
                price = people * 10.90;
            } else if ("Saturday".equals(dayOfWeek)) {
                price = people * 15.60;
            }else {
                price = people * 16;
            }


        }
        if ("Regular".equals(typeOfGroup)){
            if ("Friday".equals(dayOfWeek)){
                price = people * 15;
            } else if ("Saturday".equals(dayOfWeek)) {
                price = people * 20;
            }else {
                price = people * 22.50;
            }
            if (people >=10 && people <=20){
                price *= 0.95;
            }

        }
        System.out.printf("Total price: %.2f",price);

    }
}
