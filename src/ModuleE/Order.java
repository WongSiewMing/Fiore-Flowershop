package ModuleE;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderID;
    private String custName;
    private String addressLine1;
    private String addressLine2;
    private String postCode;
    private String state;
    private String country;
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
    private String priority;

    public Order(String orderID,String custName,String addressLine1,String addressLine2,String postCode,String state,String country,String pickUpType,String custType,String arrangeStyle,String arrangeSize,String flower,String accessories,String timestamp,String paymentStatus,String date,String orderStatus,String priority){
        this.orderID = orderID;
        this.custName = custName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postCode = postCode;
        this.state = state;
        this.country = country;
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
        this.priority = priority;
    }

    public Order() {

    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
        
}
