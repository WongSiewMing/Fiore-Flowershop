package ModuleD;

/**
 *
 * @author User
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<String> k = new DoublyLinkedList<>();
        LinkedQueue<String> q = new LinkedQueue<>();
        
        q.enqueue("0");
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        
        k.add("0");
        k.add("1");
        k.add("2");
        k.add("3");
        k.add("4");
        k.add(5,"5");
        
//        for(int i = 0; q.isEmpty() != true; i++ ){
//            k.add(i,q.dequeue());
//        }
        
        System.out.print(k.getEntry(5));
//        System.out.print(k.getNumberOfEntries());
    }
    
}
