public class CodeBuddy {
    public static void main ( String[] args ) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println("x[3] = " + x[3] ); // 4

        int[] y = {10, 20, 30, 40, 50};
        System.out.println("y[3] = " + y[3] ); // 40

        x = y;
        System.out.println("x[3] = " + x[3] ); //
    }
}
