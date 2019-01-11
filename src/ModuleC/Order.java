package ModuleC;

import ModuleA.Product;
import ModuleB.Customer;
import java.io.Serializable;

public class Order implements Serializable {

    private String order_id;
    private Customer customer;
    private String pickUpType;
    private String arrangeStyle;
    private String arrangeSize;
    private String flower;
    private String accessories;
    private String timestamp;
    private String date;
    private String orderStatus;
    private String priority;
    private String paymentStatus;
    private double total_payment;

    public Order() {

    }

    public Order(String order_id, Customer customer, String pickUpType, String arrangeStyle, String arrangeSize, String flower, String accessories, String timestamp, String date, String orderStatus, String priority, String paymentStatus, double total_payment) {
        this.order_id = order_id;
        this.customer = customer;
        this.pickUpType = pickUpType;
        this.arrangeStyle = arrangeStyle;
        this.arrangeSize = arrangeSize;
        this.flower = flower;
        this.accessories = accessories;
        this.timestamp = timestamp;
        this.date = date;
        this.orderStatus = orderStatus;
        this.priority = priority;
        this.paymentStatus = paymentStatus;
        this.total_payment = total_payment;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPickUpType() {
        return pickUpType;
    }

    public void setPickUpType(String pickUpType) {
        this.pickUpType = pickUpType;
    }

    public String getArrangeStyle() {
        return arrangeStyle;
    }

    public void setArrangeStyle(String arrangeStyle) {
        this.arrangeStyle = arrangeStyle;
    }

    public String getArrangeSize() {
        return arrangeSize;
    }

    public void setArrangeSize(String arrangeSize) {
        this.arrangeSize = arrangeSize;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(double total_payment) {
        this.total_payment = total_payment;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", customer=" + customer + ", pickUpType=" + pickUpType + ", arrangeStyle=" + arrangeStyle + ", arrangeSize=" + arrangeSize + ", flower=" + flower + ", accessories=" + accessories + ", timestamp=" + timestamp + ", date=" + date + ", orderStatus=" + orderStatus + ", priority=" + priority + ", paymentStatus=" + paymentStatus + ", total_payment=" + total_payment + '}';
    }

}
