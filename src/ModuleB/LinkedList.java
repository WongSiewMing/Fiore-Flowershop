package ModuleB;


public class LinkedList<T> implements ListInterface<T> {

  private Node firstNode; 
  private int numberOfEntries; 

  public LinkedList() {
    clear();
  }

  public final void clear() {
    firstNode = null;
    numberOfEntries = 0;
  }

  @Override
  public boolean add(T item) {
    Node newNode = new Node(item);

    if (isEmpty()) 
    {
      firstNode = newNode;
    } else {                       
      Node currentNode = firstNode;					
      while (currentNode.next != null) {		
        currentNode = currentNode.next;
      }
      currentNode.next = newNode; 
    }

    numberOfEntries++;
    return true;
  }

  @Override
  public boolean add(int newPosition, T item) { 
    boolean isSuccessful = true;

    if ((newPosition >= 0) && (newPosition <= numberOfEntries + 1)) {
      Node newNode = new Node(item);

      if (isEmpty() || (newPosition == 0)) {     
        newNode.next = firstNode;
        firstNode = newNode;
      } else {								                     
        Node nodeBefore = firstNode;
        for (int i = 0; i < newPosition - 1; i++) {
          nodeBefore = nodeBefore.next;		
        }

        newNode.next = nodeBefore.next;
        nodeBefore.next = newNode;		
      }

      numberOfEntries++;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  @Override
  public T remove(int givenPosition) {
    T result = null;                

    if ((givenPosition >= 0) && (givenPosition <= numberOfEntries)) {
      if (givenPosition == 0) {      
        result = firstNode.data;   
        firstNode = firstNode.next;
      } else {                         
        Node nodeBefore = firstNode;
        for (int i = 0; i < givenPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		
        }
        result = nodeBefore.next.data;  
        nodeBefore.next = nodeBefore.next.next;	
      } 																

      numberOfEntries--;
    }

    return result;                   
  }

  @Override
  public boolean replace(int givenPosition, T item) {
    boolean isSuccessful = true;

    if ((givenPosition >= 0) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition; i++) {
        currentNode = currentNode.next;		
      }
      currentNode.data = item;	
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  @Override
  public T getEntry(int givenPosition) {
    T result = null;

    if ((givenPosition >= 0) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition; i++) {
        currentNode = currentNode.next;		
      }
      result = currentNode.data;	
    }

    return result;
  }

  @Override
  public boolean contains(T anEntry) {
    boolean found = false;
    Node currentNode = firstNode;

    while (!found && (currentNode != null)) {
      if (anEntry.equals(currentNode.data)) {
        found = true;
      } else {
        currentNode = currentNode.next;
      }
    }

    return found;
  }

  @Override
  public int getNumberOfEntries() {
    return numberOfEntries;
  }

  @Override
  public boolean isEmpty() {
    boolean result;

    result = numberOfEntries == 0;

    return result;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public String toString() {
    String outputStr = "";
    Node currentNode = firstNode;
    while (currentNode != null) {
      outputStr += currentNode.data + "\n";
      currentNode = currentNode.next;
    }
    return outputStr;
  }

  private class Node {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  } 

}