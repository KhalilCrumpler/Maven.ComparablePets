package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        String input = scanner.nextLine();
        Integer number = Integer.parseInt(input);
        HashMap<String, String> myHash = new HashMap();
        for(int i = 0; i < number; i++){
            int temp = i + 1;
            System.out.print("What is pet number " + temp + "'s name? ");
            String petName = scanner.nextLine();
            System.out.print("What is pet number " + temp + "'s type? ");
            String petType = scanner.nextLine();
            myHash.put(petName, petType);
        }
        for(Map.Entry<String, String> entry : myHash.entrySet()){
            System.out.println("Pet name: " + entry.getKey() + "\nPet type: " + entry.getValue());
        }
        System.out.println(myHash.keySet());
    }


}
