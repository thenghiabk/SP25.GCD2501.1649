package L01_ArrayList;

import java.util.ArrayList;

public class BuiltInArrayListExample {
    public static void main ( String[] args ) {
        ArrayList myArrayList = new ArrayList( );
        myArrayList.add( "Hello" );
        myArrayList.add( "World" );
        myArrayList.add( "!" );
        myArrayList.add("Goodbye");

        for (  int i = 0; i < myArrayList.size(); i++ ) {
            System.out.println( myArrayList.get( i ) );
        }

        ArrayList myIntArrayList = new ArrayList( );
        myIntArrayList.add( 1 );
        myIntArrayList.add( 2 );
        myIntArrayList.add( 3 );
        myIntArrayList.add( 4 );

        for ( int i = 0; i < myIntArrayList.size(); i++ ) {
            System.out.println( myIntArrayList.get( i ) );
        }
    }
}
