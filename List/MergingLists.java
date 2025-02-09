package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> endlList = new ArrayList<>();

        int minSize = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstListPosition = firstList.get(i);
            int secondListPosition = secondList.get(i);

            endlList.add(firstListPosition);
            endlList.add(secondListPosition);

        }
        if (firstList.size()>secondList.size()){
            List<Integer> subList = firstList.subList(minSize,firstList.size());

            endlList.addAll(subList);
        } else if (firstList.size()< secondList.size()) {
            List<Integer> subList = secondList.subList(minSize, secondList.size());

            endlList.addAll(subList);
        }
        System.out.println(endlList.toString().replaceAll("[\\[\\],]", ""));

    }
}
