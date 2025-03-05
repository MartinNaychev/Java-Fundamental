package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,String>registeredUsers = new LinkedHashMap<>();

        for (int i = 1; i <=counter ; i++) {
            String[] input = scanner.nextLine().split( " ");
            String command = input[0];
            String name = input[1];

            if (command.equals("register")){
                String carPlate = input[2];
                if (registeredUsers.containsKey(name)){
                    System.out.println("ERROR: already registered with plate number " + registeredUsers.get(name));
                }else {
                    registeredUsers.putIfAbsent(name,carPlate);
                    System.out.printf("%s registered %s successfully%n",name,carPlate);
                }

            }else {
                if (!registeredUsers.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else {
                    System.out.printf("%s unregistered successfully%n",name);
                    registeredUsers.remove(name);
                }

            }

        }
        for (var entry : registeredUsers.entrySet()){
            String name = entry.getKey();
            String carPlate = entry.getValue();
            System.out.printf("%s => %s%n", name,carPlate);
        }



    }
}
