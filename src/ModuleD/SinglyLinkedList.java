package ModuleD;

public class SinglyLinkedList<T> implements SinglyLinkedListInterface<T> {

    private Node firstNode;
    private int size;

    public SinglyLinkedList() {
        clear();
    }

    @Override
    public final void clear() {
        firstNode = null;
        size = 0;
    }

    @Override
    public boolean add(T item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) {
        boolean isSuccessful = true;

        if ((index >= 0) && (index <= size + 1)) {
            Node newNode = new Node(item);

            if (isEmpty() || (index == 0)) {
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                Node nodeBefore = firstNode;
                for (int i = 0; i < index - 1; i++) {
                    nodeBefore = nodeBefore.next;
                }

                newNode.next = nodeBefore.next;
                nodeBefore.next = newNode;
            }

            size++;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    @Override
    public T remove(int index) {
        T result = null;

        if ((index >= 0) && (index <= size)) {
            if (index == 0) {
                result = firstNode.data;
                firstNode = firstNode.next;
            } else {
                Node nodeBefore = firstNode;
                for (int i = 0; i < index - 1; ++i) {
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.next.data;
                nodeBefore.next = nodeBefore.next.next;
            }

            size--;
        }

        return result;
    }

    @Override
    public boolean replace(int index, T item) {
        boolean isSuccessful = true;

        if ((index >= 0) && (index <= size)) {
            Node currentNode = firstNode;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.data = item;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    @Override
    public T getEntry(int index) {
        T result = null;

        if ((index >= 0) && (index <= size)) {
            Node currentNode = firstNode;
            for (int i = 0; i < index; i++) {
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
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean result;

        result = size == 0;

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
