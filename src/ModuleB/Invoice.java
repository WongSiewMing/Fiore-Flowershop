/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import ModuleE.Order;
import java.io.Serializable;

/**
 *
 * @author jun_y
 */
public class Invoice implements Serializable{
    
    
    private String invoiceID ;
    private Customer customer;
    private Order order;
    private String invoiceStatus;

  

   

    public Invoice ( ){
    
    
    }
    
  
  
    
    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
     public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    @Override
    public String toString() {
        return "Invoice{" + "invoiceID=" + invoiceID + ", customer=" + customer + ", order=" + order + ", invoiceStatus=" + invoiceStatus + '}';
    }
    
    



}