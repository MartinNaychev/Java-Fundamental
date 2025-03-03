package AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String initialWord : words) {
            String word = initialWord.toLowerCase();

            if (!counts.containsKey(word)) {
                counts.put(word, 1);
            } else {
                counts.put(word, counts.get(word) + 1);
            }
        }
        List<String> odd = new ArrayList<>();

        for (var entry : counts.entrySet()){
            if (entry.getValue()%2==1){
                odd.add(entry.getKey());
            }

        }

        System.out.println(odd.toString().replaceAll("[\\[\\]]", ""));






    }
}
