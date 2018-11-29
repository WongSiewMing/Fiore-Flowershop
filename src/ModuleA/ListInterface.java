
package ModuleA;


public interface ListInterface<T>{
    public void add(T item);
    public void add(int i,T item);
    public T get(int i);
    public boolean isEmpty();
    public Object remove(int i);
    public void clear();
    public boolean replace(int i, T item);
    public boolean contains(T item);
    public int length();
    public boolean isFull();
    public String toString();
     
}
