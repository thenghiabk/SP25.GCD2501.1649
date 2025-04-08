package L01_ArrayListADT;

public class ArrayListADT<E> implements AbstractList<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private E[] elements;
    private int nextIndex;

    public ArrayListADT() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        nextIndex = 0;
    }

    @Override
    public boolean add(E element) {
        if (nextIndex == elements.length) {
            E[] biggerArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < nextIndex; i++) {
                biggerArray[i] = elements[i];
            }
            elements = biggerArray;
        }
        elements[nextIndex] = element;
        nextIndex++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        // TODO: Insert the element at the specified index
        // - Check if index is valid (0 <= index <= nextIndex)
        // - If array is full, double its size by creating a new array and copying elements
        // - Shift elements right from index to make space
        // - Place the element at index
        // - Increment nextIndex and return true
        return false; // Placeholder return
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= nextIndex) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + nextIndex);
        }
        return elements[index];
    }

    @Override
    public E set ( int index, int element ) {
        // TODO: Replace the element at the specified index
        // - Check if index is valid (0 <= index < nextIndex)
        // - Save the old element at that index
        // - Put the new element in its place
        // - Return the old element
        return null; // Placeholder return
    }

    @Override
    public E remove(int index) {
        // TODO: Remove the element at the specified index
        // - Check if index is valid (0 <= index < nextIndex)
        // - Save the element to return it later
        // - Shift elements left starting from index + 1 to fill the gap
        // - Set the last position (nextIndex - 1) to null
        // - Decrement nextIndex and return the saved element
        return null; // Placeholder return
    }

    @Override
    public int size() {
        return nextIndex;
    }

    @Override
    public int indexOf(E element) {
        // TODO: Find the first occurrence of the element
        // - Loop through the array up to nextIndex
        // - If element is null, check for null match
        // - Otherwise, use equals() to compare with each item
        // - Return the index if found, or -1 if not
        return -1; // Placeholder return
    }

    @Override
    public boolean contains(E element) {
        // TODO: Check if the element exists in the list
        // - Use indexOf to find the element
        // - Return true if indexOf returns a valid index, false if -1
        return false; // Placeholder return
    }

    @Override
    public boolean isEmpty() {
        return nextIndex == 0;
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