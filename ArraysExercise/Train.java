package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());

        int[] peopleArrays = new int[wagons];
        int sumOfPeople = 0;

        for (int position = 0; position < peopleArrays.length; position++) {
            int peopleInEachWagon = Integer.parseInt(scanner.nextLine());
            peopleArrays[position] = peopleInEachWagon;
            sumOfPeople += peopleInEachWagon;

        }
        for (int people : peopleArrays) {
            System.out.print(people + " ");
        }

        System.out.println();
        System.out.println(sumOfPeople);
    }
}
