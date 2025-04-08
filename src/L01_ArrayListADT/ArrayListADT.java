package L01_ArrayListADT;

public class ArrayListADT implements AbstractList {
    private int[] elements;

    private int nextIndex;

    public ArrayListADT () {
        elements = new int[5];
        nextIndex = 0;
    }

    @Override
    public boolean add ( int element ) {

        if(nextIndex == elements.length){
            int[] newElements = new int[elements.length * 2];

            for ( int i = 0; i < nextIndex; i++ ) {
                newElements[i] = elements[i];
            }

            elements = newElements;
        }

        elements[nextIndex] = element;
        nextIndex++;
        return true;
    }

    @Override
    public boolean add ( int index, int element ) {
        return false;
    }

    @Override
    public int get ( int index ) {
        return 0;
    }

    @Override
    public int set ( int index, int element ) {
        return 0;
    }

    @Override
    public int remove ( int index ) {
        return 0;
    }

    @Override
    public int size () {
        return 0;
    }

    @Override
    public int indexOf ( int element ) {
        return 0;
    }

    @Override
    public boolean contains ( int element ) {
        return false;
    }

    @Override
    public boolean isEmpty () {
        return false;
    }

    public void displayInfo(){
        for ( int i = 0; i < nextIndex; i++ ) {
            System.out.println( elements[i] );
        }
    }
}

class ArraylistADTRunner {
    public static void main ( String[] args ) {
        ArrayListADT myArrayList = new ArrayListADT( );
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(60);

        myArrayList.displayInfo();
    }
}