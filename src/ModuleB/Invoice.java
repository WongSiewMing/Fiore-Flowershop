/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import java.io.Serializable;

/**
 *
 * @author jun_y
 */
public class Invoice implements Serializable{
    private int invoiceNum;
    private String companyName;
    private String date;
    private String status;
    
public Invoice(){
    
}

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNum=" + invoiceNum + ", companyName=" + companyName + ", date=" + date + ", status=" + status + '}';
    }

    
    
}
