package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);


        if (Character.isLowerCase(one)){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
