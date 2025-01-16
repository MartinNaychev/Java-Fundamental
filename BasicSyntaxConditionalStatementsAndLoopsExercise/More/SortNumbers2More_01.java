package BasicSyntaxConditionalStatementsAndLoopsExercise.More;

import java.util.Scanner;

public class SortNumbers2More_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int tree = Integer.parseInt(scanner.nextLine());

        int maxValueOne = Math.max(one,two);
        int maxValueTwo = Math.max(maxValueOne,tree);

        int minValueOne = Math.min(one,two);
        int minValueTwo = Math. min(minValueOne,tree);

        int middleValue = one+two+tree-(maxValueTwo+minValueTwo);


        System.out.println(maxValueTwo);
        System.out.println(middleValue);
        System.out.println(minValueTwo);








    }
}
