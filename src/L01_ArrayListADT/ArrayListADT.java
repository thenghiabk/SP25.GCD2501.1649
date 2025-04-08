package L01_ArrayListADT;

public class ArrayListADT<E> implements AbstractList<E> {
    private E[] elements;

    private int nextIndex;

    public ArrayListADT () {
        elements = (E[]) new Object[5];
        nextIndex = 0;
    }

    @Override
    public boolean add ( E element ) {

        if(nextIndex == elements.length){
            E[] newElements = (E[]) new Object[elements.length * 2];

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
    public boolean add ( int index, E element ) {
        return false;
    }

    @Override
    public E get ( int index ) {
        return null;
    }

    @Override
    public E set ( int index, int element ) {
        return null;
    }

    @Override
    public E remove ( int index ) {
        return null;
    }

    @Override
    public int size () {
        return 0;
    }

    @Override
    public int indexOf ( E element ) {
        return 0;
    }

    @Override
    public boolean contains ( E element ) {
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
        ArrayListADT<Integer> myArrayList = new ArrayListADT( );
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(60);

        myArrayList.displayInfo();

        ArrayListADT<String> myStringArrayList = new ArrayListADT( );
        myStringArrayList.add("Hello");
        myStringArrayList.add("World");
        myStringArrayList.add("!");
        myStringArrayList.add("Goodbye");

        myStringArrayList.displayInfo();
    }
}