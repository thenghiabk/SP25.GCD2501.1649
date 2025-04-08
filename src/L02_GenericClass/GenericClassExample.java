package L02_GenericClass;

class BoxString {
    public String content;

    public BoxString(String content) {
        this.content = content;
    }
}

class BoxInt {
    public int content;

    public BoxInt(int content) {
        this.content = content;
    }
}

class BoxContact {
    public Contact content;

    public BoxContact(Contact content) {
        this.content = content;
    }
}

class Contact {
    public String name;
    public String email;

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }
}

class Box<E>{
    public E content;
    public Box(E content){
        this.content = content;
    }
}

public class GenericClassExample {
    public static void main ( String[] args ) {
        BoxString b1 = new BoxString("Hello");
        System.out.println(b1.content);

        BoxInt b2 = new BoxInt( 2025 );
        System.out.println(b2.content);

        BoxContact b3 = new BoxContact( new Contact( "John", "john@dev.com" ) );

        // Generic class
        Box<Integer> b4 = new Box(2025);
        Box<String> b5 = new Box("World");
        Box<Contact> b6 = new Box(new Contact("David", "david@fpt.com"));
    }
}
