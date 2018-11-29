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
    public class ListArray<T> implements ListInterface<T>{
    private int size = 0;
    private T[] array;
    
    public ListArray(){
        array = (T[]) new Object[100];
    }
    
    public void add(T item){
        if(size == array.length){
            expandArray();
        }
        
        array[size] = item;
        size++;
    }
    
    public void add(int i,T item){
     
        if(i <= size){
            
            for( int index = array.length - 2; index >= 0 ; index-- )
            {
                array[index+1] = array [index];
            }

            array[i] = item;
            size++;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    private void expandArray(){
        T[] oldList = array;
        int size = oldList.length;
        array = (T[])new Object[size * 2];
        
        for(int i = 0; i < size ; i++){
            array[i] = oldList[i];
        }
    }
    
    public T get(int i){
        T item = null;
        
        if(i < size){
            item = array[i];
        }
        
        return item;
    }
    
    public boolean isEmpty(){
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Object remove(int i){
        
        if(i < size){
            Object obj = array[i];
            array[i] = null;
            int tmp = i;
            
            while(tmp < size){
                array[tmp] = array[tmp + 1];
                array[tmp + 1] = null;
                tmp++;
            }
            size--;
            return obj;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public void clear() {
        size = 0;
    }
    
    public boolean replace(int i, T item) {
        boolean isSuccessful = true;

        if ((i >= 0) && (i <= size)) {
            array[i] = item;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
      }
    
    public boolean contains(T item) {
        boolean found = false;
        for (int index = 0; !found && (index < size); index++) {
            if (item.equals(array[index])) {
                found = true;
            }
        }

        return found;
    }

    public int length() {
        return size;
    }

    public boolean isFull() {
        return  size == array.length;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < size; ++index) {
            outputStr += array[index].toString() + "\n";
        }

        return outputStr;
    }
}

