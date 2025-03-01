package ObjectsAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= counter; i++) {
            String inputForEdit = scanner.nextLine();
            String command = inputForEdit.split(": ")[0];
            String override = inputForEdit.split(": ")[1];

            if (command.equals("Edit")) {
                article.edit(override);

            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(override);

            } else {
                article.rename(override);
            }
        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());


    }
}
