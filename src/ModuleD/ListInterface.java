package ModuleD;

public interface ListInterface<T> {
    public void add(T item);
    public T get(int i);
    public void add(int i,T item);
    public Object remove(int i);
}
