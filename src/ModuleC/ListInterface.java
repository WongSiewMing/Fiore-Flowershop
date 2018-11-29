/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleC;

/**
 *
 * @author wtf981008
 */
public interface ListInterface<T> {
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
