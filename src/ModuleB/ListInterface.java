/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

/**
 *
 * @author jun_y
 */
public interface ListInterface<T> {

       public boolean add(T item);
    public boolean add(int newPosition, T item);
    public T remove(int givenPosition);
    public boolean replace(int givenPosition, T item);
    public T getEntry(int givenPosition);
    public boolean contains(T anEntry);
    public int getNumberOfEntries();
    public boolean isEmpty();
    public boolean isFull();
    public String toString();

}
 