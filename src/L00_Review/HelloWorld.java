package L00_Review;

import java.util.Scanner;

public class HelloWorld {
    public static void main ( String[] args ) {
        /*
         * Example 1: Output
         * See more: https://www.w3schools.com/java/java_output.asp
         */
        //System.out.println("Hello World!");
        //System.out.println(2025);
        //System.out.println("Hello " + 2025);
        //System.out.println("Next year: " + (2025+1));

        /*
         * Example 2: Variables
         * See more: https://www.w3schools.com/java/java_variables.asp
         */

        //int x = 3;
        //System.out.println("x = " + x); // 3
        //System.out.println("x * 5 = " + (x*5)); // 15

        //String name = "John";
        //System.out.println("Hello " + name); // Hello John

        /*
         * Example: Input
         * See more: https://www.w3schools.com/java/java_user_input.asp
         */
        Scanner scanner = new Scanner( System.in );
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you? ");
        String ageString = scanner.nextLine();

        int age = Integer.parseInt(ageString);

        System.out.println("You are " + age + " years old.");
        System.out.println("I guess you were born in " + (2025 - age));
    }
}
