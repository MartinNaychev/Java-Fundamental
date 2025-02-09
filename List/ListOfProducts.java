package List;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String productsName = scanner.nextLine();
            productsList.add(productsName);
        }
        Collections.sort(productsList);
        int number = 1;
        for (String product : productsList) {
            System.out.println(number + "." + product);
            number++;
        }
        System.out.println();
    }
}
