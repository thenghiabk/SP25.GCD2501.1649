import L03_LinkedListADT.LinkedListADT;


public class CodeBuddy {
    public static void main ( String[] args ) {
        int[] x = {1, 2, 3, 4, 5, 6};

        StringBuilder sb = new StringBuilder();
        sb.append( "[" );

        for(int i = 0; i < x.length; i++){
            sb.append( x[i] );
            if (i < x.length - 1) {
                sb.append( ", " );
            }
        }

        sb.append( "]" );


        System.out.println(sb.toString()); // [1, 2, 3, 4, 5, 6]
    }
}
