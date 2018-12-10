package ModuleE;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderID;
    private String custName;
    private String custLocation;
    private String pickUpType;
    private String custType;
    private String arrangeStyle;
    private String arrangeSize;
    private String flower;
    private String accessories;
    private String timestamp;
    private String paymentStatus;
    private String date;
    private String orderStatus;


    public Order(String orderID,String custName,String custLocation,String pickUpType,String custType,String arrangeStyle,String arrangeSize,String flower,String accessories,String timestamp,String paymentStatus,String date,String orderStatus){
        this.orderID = orderID;
        this.custName = custName;
        this.custLocation = custLocation;
        this.pickUpType = pickUpType;
        this.custType = custType;
        this.arrangeStyle = arrangeStyle;
        this.arrangeSize = arrangeSize;
        this.flower = flower;
        this.accessories = accessories;
        this.timestamp = timestamp;
        this.paymentStatus = paymentStatus;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public Order() {

    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustLocation() {
        return custLocation;
    }

    public void setCustLocation(String custLocation) {
        this.custLocation = custLocation;
    }

    public String getPickUpType() {
        return pickUpType;
    }

    public void setPickUpType(String pickUpType) {
        this.pickUpType = pickUpType;
    }

    
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
        
}
