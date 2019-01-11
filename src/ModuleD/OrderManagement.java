package ModuleD;

import ModuleC.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class OrderManagement {

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String todayDate = dateFormat.format(date);

    private LinkedQueue<Order> orderQueue = new LinkedQueue<>();
    private LinkedQueue<Order> deliveryQueue = new LinkedQueue<>();
    private LinkedQueue<Order> efficientRoute = new LinkedQueue<>();

    private SinglyLinkedList<Order> ordertoday = new SinglyLinkedList<>();
    private SinglyLinkedList<Order> deliverytoday = new SinglyLinkedList<>();

    private SinglyLinkedList<Order> custorder = new SinglyLinkedList<>();
    private SinglyLinkedList<Order> custDelivery = new SinglyLinkedList<>();

    private ModuleC.Order order = new ModuleC.Order();
    private ModuleC.Order orderList = new ModuleC.Order();

    public OrderManagement() {

    }

    public LinkedQueue<Order> getOrderqueue() {
        return orderQueue;
    }

    public void setOrderqueue(LinkedQueue<Order> orderqueue) {
        this.orderQueue = orderqueue;
    }

    public LinkedQueue<Order> getEfficientRoute() {
        return efficientRoute;
    }

    public void setEfficientRoute(LinkedQueue<Order> efficientRoute) {
        this.efficientRoute = efficientRoute;
    }

    public SinglyLinkedList<Order> getOrdertoday() {
        return ordertoday;
    }

    public void setOrdertoday(SinglyLinkedList<Order> ordertoday) {
        this.ordertoday = ordertoday;
    }

    public SinglyLinkedList<Order> getDeliverytoday() {
        return deliverytoday;
    }

    public void setDeliverytoday(SinglyLinkedList<Order> deliverytoday) {
        this.deliverytoday = deliverytoday;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrderList() {
        return orderList;
    }

    public void setOrderList(Order orderList) {
        this.orderList = orderList;
    }

    public SinglyLinkedList<Order> getCustorder() {
        return custorder;
    }

    public void setCustorder(SinglyLinkedList<Order> custorder) {
        this.custorder = custorder;
    }

    public LinkedQueue<Order> getOrderQueue() {
        return orderQueue;
    }

    public void setOrderQueue(LinkedQueue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    public LinkedQueue<Order> getDeliveryQueue() {
        return deliveryQueue;
    }

    public void setDeliveryQueue(LinkedQueue<Order> deliveryQueue) {
        this.deliveryQueue = deliveryQueue;
    }

    public SinglyLinkedList<Order> getCustDelivery() {
        return custDelivery;
    }

    public void setCustDelivery(SinglyLinkedList<Order> custDelivery) {
        this.custDelivery = custDelivery;
    }

    public void readFile() {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));

            ArrayList<Order> tmp = new ArrayList<Order>();
            tmp = (ArrayList) in.readObject();

            for (int i = 0; i < tmp.size(); i++) {
                orderList = tmp.get(i);
                orderQueue.enqueue(orderList);
            }

            for (int i = 0; i < tmp.size(); i++) {
                orderList = tmp.get(i);
                deliveryQueue.enqueue(orderList);
            }

            in.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeOrderFile() {
        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
            ArrayList tmp = new ArrayList();

            while (!orderQueue.isEmpty()) {
                orderList = orderQueue.dequeue();
                tmp.add(orderList);
            }

            out.writeObject(tmp);
            out.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeDeliveryFile() {
        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
            ArrayList tmp = new ArrayList();

            while (!deliveryQueue.isEmpty()) {
                orderList = deliveryQueue.dequeue();
                tmp.add(orderList);
            }
            out.writeObject(tmp);
            out.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void transferList() {

        readFile();
        ordertoday.clear();
        deliverytoday.clear();

        while (!orderQueue.isEmpty()) {

            order = orderQueue.dequeue();
            if ((order.getPickUpType().equals("Self Pick-Up (+ RM 0)") && order.getDate().equals(todayDate)) || (order.getPickUpType().equals("Self Pick Up") && order.getDate().equals(todayDate))) {
                    ordertoday.add(order);
            } else if ((order.getPickUpType().equals("Delivery (+ RM 10)") && order.getDate().equals(todayDate)) || (order.getPickUpType().equals("Delivery") && order.getDate().equals(todayDate))){
                    deliverytoday.add(order);
            }
        }
    }

    public void efficientRoute() {
        transferList();

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);

            if (order.getCustomer().getCustState().equals("Kuala Lumpur")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Selangor")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Perak")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Negeri Sembilan")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Pahang")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Melaka")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Penang")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Kelantan")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Terengganu")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Johor")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Kedah")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Perlis")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Sabah (+ RM 10)")) {
                efficientRoute.enqueue(order);
            }
        }

        for (int i = 0; i < deliverytoday.getNumberOfEntries(); i++) {
            order = deliverytoday.getEntry(i);
            if (order.getCustomer().getCustState().equals("Sarawak (+ RM 10)")) {
                efficientRoute.enqueue(order);
            }
        }
    }

    public void transferOrderList() {

        readFile();

        for (int i = 0; orderQueue.isEmpty() != true; i++) {
            custorder.add(i, orderQueue.dequeue());
        }
    }

    public void transferOrderQueue() {

        for (int i = 0; i < custorder.getNumberOfEntries(); i++) {
            orderQueue.enqueue(custorder.getEntry(i));
        }
    }

    public void transferDeliveryList() {

        readFile();

        for (int i = 0; deliveryQueue.isEmpty() != true; i++) {
            custDelivery.add(i, deliveryQueue.dequeue());
        }
    }

    public void transferDeliveryQueue() {

        for (int i = 0; i < custDelivery.getNumberOfEntries(); i++) {
            deliveryQueue.enqueue(custDelivery.getEntry(i));
        }
    }
}
