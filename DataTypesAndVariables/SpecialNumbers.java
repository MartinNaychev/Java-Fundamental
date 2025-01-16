package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            if (i==5 || i==7 || i==11){
                System.out.printf("%d -> True%n",i);

            }else {
                System.out.printf("%d -> False%n",i);
            }



        }
    }
}
