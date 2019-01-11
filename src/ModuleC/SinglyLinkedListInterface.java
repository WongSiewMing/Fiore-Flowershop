package ModuleC;

public interface SinglyLinkedListInterface<T> {

    public boolean add(T item);

    public boolean add(int index, T item);
     public boolean add2(int index, T item);

    public T remove(int index);

    public void clear();

    public boolean replace(int index, T item);

    public T getEntry(int index);

    public boolean contains(T item);

    public int getNumberOfEntries();

    public boolean isEmpty();

    public boolean isFull();
}
