package L00_Review;

import java.util.Scanner;

public class SimpleContactManagerScratch {
    public static void main ( String[] args ) {

        // Example 1: Get user input
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.println("How old are you? ");
        String ageString = input.nextLine();
        int age = Integer.parseInt(ageString);

        int yearOfBirth = 2025 - age;
        System.out.println("You were born in " + yearOfBirth);
        */

        // Example 2:
        //for (int i = 0; i < 5; i++) { // i++ ~ i = i + 1
        //    System.out.println(i);
        //} // 0 1 2 3 4

        // Example 3
        String[] names = { "John", "Jane", "Joe", "Jill", "Jack" };
        String[] phones = { "555-1234", "555-5678", "555-9012", "555-3456", "555-7890" };
        int numberOfContacts = names.length;

        for(int i = 0; i < numberOfContacts; i++) {
            System.out.println("Name: " + names[i] + ", Phone: " + phones[i]);
        }

    }
}
