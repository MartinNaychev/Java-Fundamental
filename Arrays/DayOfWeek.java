package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int number = Integer.parseInt(scanner.nextLine());

        if (number>=1 && number<8){
            System.out.println(days[number-1]);

        }else {
            System.out.println("Invalid day!");
        }


    }
}
