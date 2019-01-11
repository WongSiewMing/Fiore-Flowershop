package ModuleD;

public interface DoublyLinkedListInterface<T> {
    public void add(T item);
    public boolean add(int newPosition, T item);
    public T remove(int index);
    public void clear();
    public boolean replace(int givenPosition, T item);
    public T getEntry(int givenPosition);
    public boolean contains(T item);
    public int getNumberOfEntries();
    public boolean isEmpty();
    public boolean isFull();
}
