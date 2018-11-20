package ModuleD;

public class StackArray<T> implements StackInterface<T> {
    private int lastIndex;
    private T[] stack;
    private static final int initialcapacity = 50;
    
    public StackArray(){
        this(initialcapacity);
    } 
    
    public StackArray(int initialcapacity){
        stack = (T[])new Object[initialcapacity];
        lastIndex = -1;
    }
    
    public void push(T item) {
        lastIndex++;
        
        if(lastIndex >= stack.length){
            doubleArray();
        }
        stack[lastIndex] = item;
        
    }
    
    private void doubleArray(){
        T[] oldStack = stack;
        int oldSize = oldStack.length;
        
        stack = (T[]) new Object[oldSize * 2];
        
        System.arraycopy(oldStack, 0, stack, 0, oldSize);
        
        
    }

    public T pop() {
        T top = null;
        
        if(!isEmpty()){
            top = stack[lastIndex]; //retrieve data
            stack[lastIndex] = null; // delete the top data
            lastIndex--; // decrement the lastindex
        }
        
        
        return top;
    }

    public T peek() {
        T top = null;
        
        if(!isEmpty()){
            top = stack[lastIndex];
        }
        
        return top;
    }

    public boolean isEmpty() {
        if(lastIndex < 0){
            return true;
        }
        else
        {
            return false;
        }
    }

    public void clear() {
        lastIndex = -1;
    }
}