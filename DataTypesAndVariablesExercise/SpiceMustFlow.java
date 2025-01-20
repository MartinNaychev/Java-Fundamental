package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int spice = 0;
        int days = 0;

        while (startingYield >= 100) {

            spice+=startingYield;
            spice-=26;
            startingYield -= 10;
            days++;
        }
        if (spice<26){
            spice=0;

        }else {
            spice-=26;
        }
        System.out.printf("%d%n%d",days,spice);


        //for (int i = startingYield; i >= 100; i -= 10) {
        //    int count = i;

        //    if (count >= 26) {
        //        count -= 26;
        //    } else {
        //        count -= count;
        //    }

        //    spice += count;
        //    days++;
        //}

        //System.out.printf("%d%n%d", days, spice - 26);
    }
}
