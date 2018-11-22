package ModuleD;

public class QueueArray<T> implements QueueInterface<T> {
    private T[] queue;
    private int lastIndex;
    private static final int firstIndex = 0;
    private static final int initialCapacity = 50;
    
    public QueueArray(){
        this(initialCapacity);
    }
    
    public QueueArray(int initialCapacity){
        queue = (T[]) new Object[initialCapacity];
        lastIndex = -1;
    }
    
    public void enqueue(T item) {
        
        if(isArrayFull()){      
            doubleArray();
        }
        
        lastIndex++;
        queue[lastIndex] = item;
        
    }
    
    private void doubleArray(){
        
        T[] oldQueue = queue;
        int oldSize = oldQueue.length;
        
        queue = (T[]) new Object[oldSize * 2];
        
        System.arraycopy(oldQueue, 0, queue, 0, oldSize);
      
    }
    
    public T dequeue() {
        T front = null;
        
        if(!isEmpty()){
            front = queue[firstIndex];
            
            //delete the front, perform data shifting
            for(int i = firstIndex; i< lastIndex; i++){
                queue[i] = queue[i+1];
            }
        }
        
       lastIndex--;
        
        return front;
    }

    public T getFront() {
        T front = null;
        
        if(!isEmpty()){ 
            front = queue[firstIndex];
        }
        
        return front;
    }
    
    public boolean isEmpty() {
        return firstIndex > lastIndex;
    }
    
    public void clear() {
        lastIndex = -1;
    }
    
    private boolean isArrayFull() {
        return lastIndex == queue.length - 1;
    }  
}
