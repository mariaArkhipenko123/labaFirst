package bsu.rfe.Arkhipenko6group;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Potato")) {
                breakfast[itemsSoFar] = new Potato(parts[1]);
            } else if (parts[0].equals("Beef")) {
                breakfast[itemsSoFar] = new Beef(parts[1]);
            } else if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Tea")) {
                breakfast[itemsSoFar] = new Tea(parts[1]);
            }
            itemsSoFar++;
        }
        System.out.println("Type product to count: ");
        Scanner scanner = new Scanner(System.in);
        String to_find_str = scanner.nextLine();

        String[] parts = to_find_str.split("/");
        Food toFind = null;

        if (parts[0].equals("Potato")) {
            toFind = new Potato(parts[1]);
        } else if (parts[0].equals("Beef")) {
            toFind = new Beef(parts[1]);
        } else if (parts[0].equals("Tea")) {
            toFind = new Tea(parts[1]);
        } else if (parts[0].equals("Cheese")) {
            toFind = new Cheese();
        }


        int counter = 0;
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                if (item.equals(toFind)) {
                    counter++;
                }
            } else {
                break;
            }
        }
        System.out.println("Items in a meal - " + itemsSoFar);
        System.out.println(toFind.getName() + " amount: " + counter);
        
    }
}