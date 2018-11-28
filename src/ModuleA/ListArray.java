
package ModuleA;


public class ListArray<T> implements ListInterface<T>{
    
    private T[] list;
    private int numOfItem;
    private static final int capacity = 25;
    
    public ListArray(){
        this(capacity);
    }
    
    public ListArray(int capacity){
        numOfItem = 0;
        list = (T[]) new Object[capacity];
    }
    
    public void add(T newEntry){
        if (isFull()){
            expandArray();
        }
        
        list[numOfItem] = newEntry;
        numOfItem++;
    }
    
    public boolean add(int newPosition, T newEntry){
        boolean success = true;
        
        if ((newPosition >= 0) && (newPosition <= numOfItem + 1)){
            if (isFull()){
                expandArray();
            }
            makeRoom(newPosition);
            list[newPosition] = newEntry;
            numOfItem++;
        }
        else {
            success = false;
        }
        return success;
    }
    public T remove(int givenPosition){
        T result = null;

        if ((givenPosition >= 0) && (givenPosition <= numOfItem)) {
            result = list[givenPosition];

            if (givenPosition < numOfItem) {
                removeGap(givenPosition);
            }

            numOfItem--;
        }
        return result;
    }
    
    public void clear() {
        numOfItem = 0;
    }
    
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPosition >= 0) && (givenPosition <= numOfItem)) {
            list[givenPosition] = newEntry;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
      }

    public T get(int givenPosition) {
        T result = null;

        if ((givenPosition >= 0) && (givenPosition <= numOfItem)) {
          result = list[givenPosition];
        }

        return result;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        for (int index = 0; !found && (index < numOfItem); index++) {
            if (anEntry.equals(list[index])) {
                found = true;
            }
        }

        return found;
    }

    public int getLength() {
        return numOfItem;
    }

    public boolean isEmpty() {
        return numOfItem == 0;
    }

    public boolean isFull() {
        return  numOfItem == list.length;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numOfItem; ++index) {
            outputStr += list[index] + "\n";
        }

        return outputStr;
    }
    
    private void expandArray() {
        T[] oldList = list; 
        int oldSize = oldList.length;     

        list = (T[]) new Object[2 * oldSize];
        
        for (int index = 0; index < oldSize; index++) {
            list[index] = oldList[index];
        }
    } 

    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numOfItem - 1;
        
        for (int index = lastIndex; index >= newIndex; index--) {
            list[index + 1] = list[index];
        }
    }
    
    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = numOfItem - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            list[index] = list[index + 1];
        }
      }
}
