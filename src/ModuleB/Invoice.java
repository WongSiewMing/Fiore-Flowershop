/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import ModuleC.Order;
import java.io.Serializable;

/**
 *
 * @author jun_y
 */
public class Invoice implements Serializable{

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceID=" + invoiceID + ", customerID=" + customerID + ", orderID=" + orderID + ", invoiceStatus=" + invoiceStatus + '}';
    }
    
    
    private String invoiceID ;
    private String customerID;
    private String orderID;
    private String invoiceStatus;

 public Invoice(){
     
 }

   
   

    



}