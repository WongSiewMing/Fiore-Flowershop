package ModuleA;

public interface CircularLinkedListInterface<T> {
    public void add(T item);
    public void add(int index, T item);
    public void remove(int index);
    public void clear();
    public boolean replace(int index, T item);
    public T getEntry(int index);
    public boolean contains(T item);
    public int size();
    public boolean isEmpty();
    public boolean isFull();
}
