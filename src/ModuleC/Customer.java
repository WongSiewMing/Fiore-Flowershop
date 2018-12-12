
package ModuleC;

import java.io.Serializable;
import java.util.ListIterator;

public class Customer implements Serializable{

    private String custId;
    private String custName;
    private String custAddress;
    private String type;
    private String contact;
    private double limit;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

 
    public String toString() {
        return String.format("%s %s %s %s %s %.2f", custId, custName,custAddress,type,contact,limit);
    }

    ListIterator<Object> ListIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
