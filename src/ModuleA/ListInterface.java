
package ModuleA;


public interface ListInterface<T>{
    public void add(T newEntry);
    public boolean add(int newPosition, T newEntry);
    public T remove(int givenPosition);
    public void clear();
    public boolean replace(int givenPosition, T newEntry);
    public T get(int givenPosiition);
    public boolean contains(T anEntry);
    public int getLength();
    public boolean isEmpty();
    public boolean isFull();
    public String toString();
}
