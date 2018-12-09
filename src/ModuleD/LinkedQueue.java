package ModuleD;

public class LinkedQueue<T> implements QueueInterface<T> {

  private Node firstNode; 
  private Node lastNode; 

  public LinkedQueue() {
    firstNode = null;
    lastNode = null;
  } 

  public void enqueue(T item) {
    Node newNode = new Node(item, null);

    if (isEmpty()) {
      firstNode = newNode;
    } else {
      lastNode.next = newNode;
    }

    lastNode = newNode;
  } 

  public T getFront() {
    T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
    }

    return front;
  } 

  public T dequeue() {
    T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
      firstNode = firstNode.next;

      if (firstNode == null) {
        lastNode = null;
      }
    }

    return front;
  } 

  public boolean isEmpty() {
    return (firstNode == null) && (lastNode == null);
  } 

  public void clear() {
    firstNode = null;
    lastNode = null;
  } 

  private class Node {

    private T data; 
    private Node next; 

    private Node(T dataPortion) {
      data = dataPortion;
      next = null;
    } 

    private Node(T dataPortion, Node linkPortion) {
      data = dataPortion;
      next = linkPortion;
    } 
  } 
} 