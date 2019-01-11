package ModuleD;

public class DoublyLinkedList<T> implements DoublyLinkedListInterface<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T> {

        T data;
        Node<T> prev, next;

        private Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void add(T item) {
        addLast(item);
    }

    public boolean add(int index, T item) {
        boolean isSuccessful = true;
        int i;
        Node<T> currentNode = null;

        if ((index >= 0) && (index <= size)) {
            Node newNode = new Node(item);

            if (isEmpty() || (index == 0)) {
                newNode.next = head;
                head = tail = newNode;
            } // Search from the front of the list
            else if (index < size / 2) {
                for (i = 1, currentNode = head; i != index; i++) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;

            } // Search from the back of the list
            else if(index == size + 1){
                addLast(item);
            }
            else {
                for (i = size, currentNode = tail; i != index; i--) {
                    currentNode = currentNode.prev;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            size++;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;

    }

    public void addLast(T item) {

        if (isEmpty()) {
            head = tail = new Node<T>(item, null, null);
        } else {
            tail.next = new Node<T>(item, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public void clear() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            Node<T> next = currentNode.next;
            currentNode.prev = currentNode.next = null;
            currentNode.data = null;
            currentNode = next;
        }
        head = tail = currentNode = null;
        size = 0;
    }

    public int getNumberOfEntries() {
        return size;
    }

    public boolean isEmpty() {
        return getNumberOfEntries() == 0;
    }

    public boolean replace(int index, T item) {
        boolean isSuccessful = true;
        int i;
        Node<T> currentNode = null;

        // Search from the front of the list
        if ((index >= 0) && (index <= size)) {
            if (index < size / 2) {
                for (i = 0, currentNode = head; i != index; i++) {
                    currentNode = currentNode.next;
                }
            } // Search from the back of the list
            else {
                for (i = size - 1, currentNode = tail; i != index; i--) {
                    currentNode = currentNode.prev;
                }
            }
            currentNode.data = item;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    public void addFirst(T item) {

        if (isEmpty()) {
            head = tail = new Node<T>(item, null, null);
        } else {
            head.prev = new Node<T>(item, null, head);
            head = head.prev;
        }
        size++;
    }

    public T peekFirst() {
        return head.data;
    }

    public T peekLast() {
        return tail.data;
    }

    public T removeFirst() {

        T data = head.data;
        head = head.next;
        --size;

        if (isEmpty()) {
            tail = null;
        } else {
            head.prev = null;
        }

        return data;
    }

    public T removeLast() {

        T data = tail.data;
        tail = tail.prev;
        --size;

        if (isEmpty()) {
            head = null;
        } else {
            tail.next = null;
        }

        return data;
    }

    private T remove(Node<T> node) {

        if (node.prev == null) {
            return removeFirst();
        }
        if (node.next == null) {
            return removeLast();
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;

        T data = node.data;

        node.data = null;
        node = node.prev = node.next = null;

        --size;

        return data;
    }

    public T remove(int index) {

        int i;
        Node<T> currentNode;

        // Search from the front of the list
        if (index < size / 2) {
            for (i = 0, currentNode = head; i != index; i++) {
                currentNode = currentNode.next;
            }

            // Search from the back of the list
        } else {
            for (i = size - 1, currentNode = tail; i != index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return remove(currentNode);

    }

    public boolean removeAt(Object obj) {

        Node<T> trav = head;

        //Search for null object
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next) {
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
            //Search for non null object
        } else {
            for (trav = head; trav != null; trav = trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }
        return false;
    }

    public T getEntry(int index) {
        T result = null;
        int i;
        Node<T> currentNode = null;

        if ((index >= 0) && (index <= size)) {
            if (index < size / 2) {
                for (i = 0, currentNode = head; i != index; i++) {
                    currentNode = currentNode.next;
                }
            } // Search from the back of the list
            else {
                for (i = size, currentNode = tail; i != index; i--) {
                    currentNode = currentNode.prev;
                }
            }
            result = (T) currentNode.data;
        }
        return result;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = head;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    public boolean isFull() {
        return false;
    }

    public String toString() {
        String outputStr = "";
        Node currentNode = head;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return outputStr;
    }

}
