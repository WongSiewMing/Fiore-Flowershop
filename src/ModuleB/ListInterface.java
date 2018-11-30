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