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
         * Example 3: Input
         * See more: https://www.w3schools.com/java/java_user_input.asp
         */
        //Scanner scanner = new Scanner( System.in );
        //System.out.println("What's your name? ");
        //String name = scanner.nextLine();
        //System.out.println("Hello " + name);
        //
        //System.out.println("How old are you? ");
        //String ageString = scanner.nextLine();
        //
        //int age = Integer.parseInt(ageString);
        //
        //System.out.println("You are " + age + " years old.");
        //System.out.println("I guess you were born in " + (2025 - age));

        /*
         * Example 4: Booleans
         * See more: https://www.w3schools.com/java/java_booleans.asp
         */

        //int x = 3;
        //int y = 5;
        //
        //boolean result = x > y;
        //
        //System.out.println("x > y: " + result); // false
        //System.out.println("x < y: " + (x < y)); // true
        //System.out.println("x == y: " + (x == y)); // false
        //System.out.println("x != y: " + (x != y)); // true

        /*
         * Example 5: If statements
         * See more: https://www.w3schools.com/java/java_conditions_elseif.asp
         */

        //Scanner scanner = new Scanner( System.in );
        //System.out.println("What time is it? ");
        //int time = Integer.parseInt( scanner.nextLine() ) ;
        //
        //if (time < 10) {
        //    System.out.println("Good morning.");
        //} else if (time < 18) {
        //    System.out.println("Good day.");
        //} else {
        //    System.out.println("Good evening.");
        //}

        /*
         * Example 6: Switch statements
         * See more: https://www.w3schools.com/java/java_switch.asp
         */
        //Scanner scanner = new Scanner( System.in );
        //System.out.println("What's your favorite day (1-7)? ");
        //int day = Integer.parseInt( scanner.nextLine() );
        //
        //switch (day) {
        //    case 1:
        //        System.out.println("Monday");
        //        break;
        //    case 2:
        //        System.out.println("Tuesday");
        //        break;
        //    case 3:
        //        System.out.println("Wednesday");
        //        break;
        //    case 4:
        //        System.out.println("Thursday");
        //        break;
        //    case 5:
        //        System.out.println("Friday");
        //        break;
        //    case 6:
        //        System.out.println("Saturday");
        //        break;
        //    case 7:
        //        System.out.println("Sunday");
        //        break;
        //}

        /*
         * Example 7: While loops
         * See more: https://www.w3schools.com/java/java_loop_while.asp
         */

        //while(true)
        //{
        //    Scanner scanner = new Scanner( System.in );
        //    System.out.println("What's your name? ");
        //    String name = scanner.nextLine();
        //    System.out.println("Hello " + name);
        //
        //    System.out.println("Do you want to continue (y/n)? ");
        //    String response = scanner.nextLine();
        //
        //    if (response.equalsIgnoreCase("n")) {
        //        System.out.println("Goodbye!");
        //        break;
        //    }
        //}

        /*
         * Example 8: For loops
         * See more: https://www.w3schools.com/java/java_loop_for.asp
         */

        //for (int i = 0; i < 10; i++) {
        //
        //    if (i == 5) {
        //        break;
        //    }
        //
        //    System.out.println( "i = " + i + ": Hello World." );
        //}


        /*
         * Example 9: Arrays
         * See more: https://www.w3schools.com/java/java_arrays.asp
         */

        //int[] x = new int[10];
        //x[0] = 10;
        //x[1] = 20;
        //x[2] = 30;
        //x[3] = 40;
        //x[4] = 50;
        //x[5] = 60;

        //for(int i = 0; i < x.length; i++){
        //    System.out.println(x[i]);
        //}

        String[] names = { "John", "Jane", "Joe", "Jill", "Jack", "Lucy" };
        System.out.println(names.length);

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }


    }
}
