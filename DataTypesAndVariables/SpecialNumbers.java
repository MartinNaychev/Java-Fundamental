package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = i;
            if (i>=10) {
                int a = i%10;
                int b = i / 10;
                sum = a+b;
            }
            if (sum==5 || sum==7 || sum==11){
                System.out.printf("%d -> True%n",i);

            }else {
                System.out.printf("%d -> False%n",i);
            }
            
        }
    }
}
