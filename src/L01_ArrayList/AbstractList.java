package L01_ArrayList;

/**
 * This interface is a blueprint for a list data structure. It provides methods for
 * adding, removing and accessing elements, as well as for checking the size and
 * emptiness of the list.
 */
public interface AbstractList {
    /**
     * Adds an element to the end of the list and increases the size.
     * @param element the element to be added
     * @return true if the element was added, false otherwise
     */
    boolean add(int element);
    /**
     * Adds an element at the specified position in the list and increases the size.
     * @param index the position where the element is to be added
     * @param element the element to be added
     * @return true if the element was added, false otherwise
     */
    boolean add(int index, int element);
    /**
     * Returns the element at the specified position in the list.
     * @param index the position of the element to be returned
     * @return the element at the specified position
     */
    int get(int index);
    /**
     * Replaces the element at the specified position in the list with the
     * specified element.
     * @param index the position of the element to be replaced
     * @param element the element to be added
     * @return the element that was replaced
     */
    int set(int index, int element);
    /**
     * Removes the element at the specified position in the list and decreases the size.
     * @param index the position of the element to be removed
     * @return the element that was removed
     */
    int remove(int index);
    /**
     * Returns the number of elements in the list.
     * @return the size of the list
     */
    int size();
    /**
     * Returns the index of the first occurrence of the specified element in the
     * list, or -1 if the list does not contain the element.
     * @param element the element to be searched
     * @return the index of the first occurrence of the element, or -1 if the list
     * does not contain the element
     */
    int indexOf(int element);
    /**
     * Checks if the list contains the specified element.
     * @param element the element to be searched
     * @return true if the list contains the element, false otherwise
     */
    boolean contains(int element);
    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();
}