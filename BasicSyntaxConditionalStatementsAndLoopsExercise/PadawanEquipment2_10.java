package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double lightSabers = Math.ceil(students * 1.10) * priceLightSabers ;
        int freeBelts = 0;

        if (students>=6){
            freeBelts = students / 6;
        }
        double belts = (students - freeBelts) * priceBelts;
        double robes = students * priceRobes;
        double total = lightSabers + belts + robes;

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - budget);
        }


    }
}
