package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double ballValue = 0;
        int ballSnow = 0;
        int ballTime = 0;
        int ballQuality = 0;

        for (int i = 1; i <= n ; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double calculatedSnowBall = Math.pow(snowballSnow / snowballTime,snowballQuality);
            if (calculatedSnowBall>ballValue){
                ballValue=calculatedSnowBall;
                ballSnow = snowballSnow;
                ballTime = snowballTime;
                ballQuality = snowballQuality;

            }


        }

        System.out.printf("%d : %d = %.0f (%d)",ballSnow,ballTime,ballValue,ballQuality );
    }
}
