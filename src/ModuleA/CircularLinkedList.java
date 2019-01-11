package ModuleA;

public class CircularLinkedList<T> implements CircularLinkedListInterface<T> {

    private Node<T> head;
    private int size = 0;

    public void addFront(T item) {
        Node<T> newNode = new Node<T>(item);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node<T> temp = head;
            newNode.next = temp;
            head = newNode;
        }
        size++;
    }

    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (null == head) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        newNode.next = head;
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index is Invalid");
        }

        Node<T> newNode = new Node<T>(item);
        Node<T> tempNode = head;
        Node<T> prevNode = null;

        if (isEmpty() || index == 0) {
            addFront(item);
        } else {

            for (int i = 0; i < index; i++) {

                prevNode = tempNode;
                tempNode = tempNode.next;
            }

            prevNode.next = newNode;
            newNode.next = tempNode;
        }
        size++;
    }

    public void removeFront() {
        Node<T> temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Position is Invalid");
        }
        Node<T> current = head, previous = head;
        for (int i = 0; i < index; i++) {
            if (current.next == head) {
                break;
            }
            previous = current;
            current = current.next;
        }
        if (index == 0) {
            removeFront();
        } else {
            previous.next = current.next;
        }
        size--;
    }

    public final void clear() {
        head = null;
        size = 0;
    }

    public boolean replace(int index, T item) {
        boolean isSuccessful = true;

        if ((index >= 0) && (index <= size)) {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.item = item;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    public T getEntry(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is Invalid");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (T) temp.item;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = head;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.item)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty !!");
        } else {
            Node<T> temp = head;
            while (temp.next != head) {
                System.out.println("Data at Node = " + temp.item);
                temp = temp.next;
            }
            System.out.println("Data at Node = " + temp.item);
        }
        System.out.println();
    }

    public class Node<T> {

        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }

        public String toString() {
            return "" + item;
        }

    }

}
