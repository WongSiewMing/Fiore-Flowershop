package ModuleE;

import java.io.Serializable;

public class Order implements Serializable {
    private String custName;
    private String custType;
    private String arrangeStyle;
    private String arrangeSize;
    private String flower;
    private String accessories;
    private String priority;
    private String timestamp;
    private String paymentStatus;

    public Order(String custName,String custType,String arrangeStyle,String arrangeSize,String flower,String accessories,String priority,String timestamp,String paymentStatus){
        this.custName = custName;
        this.custType = custType;
        this.arrangeStyle = arrangeStyle;
        this.arrangeSize = arrangeSize;
        this.flower = flower;
        this.accessories = accessories;
        this.priority = priority;
        this.timestamp = timestamp;
        this.paymentStatus = paymentStatus;
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
