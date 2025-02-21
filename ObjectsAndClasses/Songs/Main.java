package ObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs ; i++) {
            String[] input = scanner.nextLine().split("_");

            String typeList = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song(typeList,name,time);
            songList.add(song);
        }
        String command = scanner.nextLine();

        for (Song song : songList) {
            if (command.equals(song.getTypeList())){
                System.out.println(song.getName());
            } else if (command.equals("all")) {
                System.out.println(song.getName());

            }

        }



    }
}
