package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        String n = "";

        for (int position = array.length-1; position >=0 ; position--) {

            n+= array[position]+" ";

        }

        System.out.println(n);

    }
}
