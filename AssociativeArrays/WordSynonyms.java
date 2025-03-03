package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= counter; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            synonyms.putIfAbsent(key, new ArrayList<>());

            synonyms.get(key).add(value);

        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {

            System.out.println(entry.getKey() + " - " + String.join(", ",entry.getValue()) );


        }


    }
}
