/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleC;

/**
 *
 * @author wtf981008
 */
public class Product {
    private String CustName;
    private String CustAddress;
    private String ProductID;
    private String Selection;
    private String Payment;

    public Product() {
        
    }

    public String getCustName() {
        return CustName;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public String getProductID() {
        return ProductID;
    }

    public String getSelection() {
        return Selection;
    }
    
    public String getPayment() {
        return Payment;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public void setSelection(String Selection) {
        this.Selection = Selection;
    }
    
    public void setPayment(String Payment) {
        this.Payment = Payment;
    }

    @Override
    public String toString() {
        return "Product{" + "CustName=" + CustName + ", CustAddress=" + CustAddress + ", ProductID=" + ProductID + ", Selection=" + Selection + ", Payment=" + Payment + '}';
    }
    

}
