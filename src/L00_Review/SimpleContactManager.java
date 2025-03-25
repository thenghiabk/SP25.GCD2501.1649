package L00_Review;

import java.util.Scanner;

public class SimpleContactManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Define the maximum number of contacts.
        final int MAX_CONTACTS = 100;

        // Create parallel arrays to store names, phone numbers and emails
        String[] names = new String[MAX_CONTACTS];
        String[] phoneNumbers = new String[MAX_CONTACTS];
        String[] emails = new String[MAX_CONTACTS];

        // Keep track of the number of contacts currently stored.
        int numContacts = 0;

        // Main loop of the application.
        while (true) {
            System.out.println("Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt( input.nextLine() );

            switch (choice) {
                case 1: // Add Contact
                    if (numContacts < MAX_CONTACTS) {
                        System.out.print("Enter contact name: ");
                        names[numContacts] = input.nextLine();

                        System.out.print("Enter phone number: ");
                        phoneNumbers[numContacts] = input.nextLine();

                        System.out.print("Enter email: ");
                        emails[numContacts] = input.nextLine();

                        numContacts++; // ~ numContact = numContact + 1

                        System.out.println("Contact added!");
                    } else {
                        System.out.println("Contact list is full!");
                    }
                    break;

                case 2: // View Contacts
                    System.out.println("\n--- Contacts ---");
                    if (numContacts == 0) {
                        System.out.println("No contacts to display.");
                    } else {
                        for (int i = 0; i < numContacts; i++) {
                            System.out.println("Name: " + names[i] + ", Phone: " + phoneNumbers[i] + ", Email: " + emails[i]);
                        }
                    }
                    break;

                case 3: // Search Contacts
                    System.out.print("Enter name to search: ");

                    String searchName = input.nextLine();

                    boolean found = false;

                    for (int i = 0; i < numContacts; i++) {
                        // Use equalsIgnoreCase for case-insensitive search
                        if (names[i] != null && names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Name: " + names[i] + ", Phone: " + phoneNumbers[i] + ", Email: " + emails[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) { // ~ found == false
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting... Goodbye!");
                    input.close();
                    return; // Exit the main method (and the program)

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}