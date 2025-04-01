package L00_Review;

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

    public void editContact(String newName, String newPhoneNumber, String newEmail){
        this.name = newName;
        this.phoneNumber = newPhoneNumber;
        setEmail( newEmail );
    }
}

public class ContactManagementSystemOOP {
    public static void main ( String[] args ) {
        Contact contact1 = new Contact();
        contact1.displayInfo();

        Contact contact2 = new Contact("John Doe", "+1234567890", "Q2YtD@example.com");
        contact2.displayInfo();

        //contact1.name = "David Smith";
        //contact1.phoneNumber = "+84123456789";
        //contact1.email = "david@example";

        contact2.editContact( "David Smith", "+84123456789", "david@example" );
        contact1.displayInfo();
    }
}
