package ModuleD;

public class ListArray<T> implements ListInterface<T> {
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
    
    public void add(int i,T item){
     
        if(i < size){
            
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
}
