package ModuleE;

import java.io.Serializable;

public class Order implements Serializable {
    private String custName;
    private String custType;
    private String arrangeStyle;
    private String arrangeSize;
    private String flower;
    private String accessories;
    private String timestamp;
    private String paymentStatus;
    private String date;


    public Order(String custName,String custType,String arrangeStyle,String arrangeSize,String flower,String accessories,String timestamp,String paymentStatus,String date){
        this.custName = custName;
        this.custType = custType;
        this.arrangeStyle = arrangeStyle;
        this.arrangeSize = arrangeSize;
        this.flower = flower;
        this.accessories = accessories;
        this.timestamp = timestamp;
        this.paymentStatus = paymentStatus;
        this.date = date;
    }

    public Order() {

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
