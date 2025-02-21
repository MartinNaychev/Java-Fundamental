package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());


        BigInteger total = new BigInteger("1");


        for (int i = 1; i <= number ; i++) {
            String toString = String.valueOf(i);
            BigInteger counter = new BigInteger(toString);
            total = total.multiply(counter);

        }

        System.out.println(total);



    }
}
