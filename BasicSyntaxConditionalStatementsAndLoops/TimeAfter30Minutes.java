package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TimeAfter30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = ours * 60 + minutes;

        totalMinutes +=30;

        ours = totalMinutes / 60;
        minutes = totalMinutes % 60;

        if (ours > 23){
            ours = 0;
        }

        if (minutes > 9){
            System.out.printf("%d:%d", ours, minutes);
        }else {
            System.out.printf("%d:0%d",ours,minutes);
        }



    }
}
