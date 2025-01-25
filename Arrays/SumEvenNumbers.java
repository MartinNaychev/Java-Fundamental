package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

       // for (int position = 0; position < array.length ; position++) {
//
       //     int currentNumber = array[position];
//
       //     if (currentNumber%2==0){
       //         sum+=currentNumber;
       //     }
//
       // }
       // System.out.println(sum);


        for (int currentNumber : array) {
            if (currentNumber%2==0){
                sum+=currentNumber;
            }
        }

        System.out.println(sum);
    }
}
