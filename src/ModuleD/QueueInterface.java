package ModuleD;

public interface QueueInterface<T> {
    
    public void enqueue(T item);
    public T dequeue();
    public T getFront();
    public boolean isEmpty();
    public void clear();
    
}
