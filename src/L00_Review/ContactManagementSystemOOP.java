package L00_Review;

import java.util.Scanner;

class Contact {
    // fields / attributes
    private String name;
    private String phoneNumber;
    private String email;

    // constructor
    public Contact(){ // default
        name = "Dummy Name";
        phoneNumber = "+000000000";
        email = "dummy@example.com";
    }

    // parameterized constructor
    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        setEmail( email );
    }


    // getters and setters
    private void setEmail(String email){

        // validation
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        // validation
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.email = email;
    }

    // helpers
    public void displayInfo(){
        System.out.println("Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email);
    }

    public boolean findContactByName(String searchName){
        if(this.name.equalsIgnoreCase( searchName )) {
            return true;
        } else {
            return false;
        }
    }

    public void updateInfo( String newPhoneNumber, String newEmail ) {
        this.phoneNumber = newPhoneNumber;
        setEmail( newEmail );
    }
}

public class ContactManagementSystemOOP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Define the maximum number of contacts.
        final int MAX_CONTACTS = 100;

        // Create an array of contacts
        Contact[] contacts = new Contact[MAX_CONTACTS];

        // Keep track of the number of contacts currently stored.
        int numContacts = 0;

        // Main loop of the application.
        while (true) {
            System.out.println("Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt( input.nextLine() );

            switch (choice) {
                case 1: // Add Contact
                    if (numContacts < MAX_CONTACTS) {
                        System.out.print("Enter contact name: ");
                        String name = input.nextLine();

                        System.out.print("Enter phone number: ");
                        String phoneNumber = input.nextLine();

                        System.out.print("Enter email: ");
                        String email = input.nextLine();

                        Contact contact = new Contact(name, phoneNumber, email);

                        contacts[numContacts] = contact;

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
                            contacts[i].displayInfo();
                        }
                    }
                    break;

                case 3: // Search Contacts
                    System.out.print("Enter name to search: ");

                    String searchName = input.nextLine();

                    boolean found = false;

                    for (int i = 0; i < numContacts; i++) {
                        // Use equalsIgnoreCase for case-insensitive search
                        if (contacts[i].findContactByName(searchName)) {
                            contacts[i].displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) { // ~ found == false
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Edit Contact
                    System.out.print("Enter contact name to edit: ");
                    String contactName = input.nextLine();

                    boolean contactFound = false;

                    for (int i = 0; i < numContacts; i++) {

                        if(contacts[i].findContactByName( contactName )){
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = input.nextLine();

                            System.out.print("Enter new email: ");
                            String newEmail = input.nextLine();

                            // Found the contact and update the contact
                            contacts[i].updateInfo(newPhoneNumber, newEmail);

                            contactFound = true;
                            break;
                        }
                    }

                    if(contactFound == false) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting... Goodbye!");
                    input.close();
                    return; // Exit the main method (and the program)

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
