/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import java.io.Serializable;
import java.util.ListIterator;

/**
 *
 * @author jun_y
 */
public class Customer implements Serializable{

    private String custId;
    private String custName;
    private String custAddressLine1;
    private String custAddressLine2;
    private String custPostCode;
    private String custState;
    private String custCountry;
    private String type;
    private String contact;
    private String creditStatus;
    private double currentCredit;
    private double limit;
     

  

    Customer(String custId, String  custName, String custAddressLine1,String custAddressLine2,String custPostCode,String custState,String custCountry, String type, String contact,String creditStatus,double currentCredit, double limit) {
       this.custId=custId;
       this.custName=custName;
       this.custAddressLine1=custAddressLine1;
       this.custAddressLine2=custAddressLine2;
       this.custPostCode=custPostCode;
       this.custState=custState;
       this.custCountry=custCountry;
       this.type=type;
       this.contact=contact;
       this.creditStatus=creditStatus;
       this.currentCredit=currentCredit;
       this.limit=limit;
       
       
    }
    Customer(){
        
    }

    @Override
    public String toString() {
        return custId;
    }

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

    public String getCustAddressLine1() {
        return custAddressLine1;
    }

    public void setCustAddressLine1(String custAddressLine1) {
        this.custAddressLine1 = custAddressLine1;
    }

    public String getCustAddressLine2() {
        return custAddressLine2;
    }

    public void setCustAddressLine2(String custAddressLine2) {
        this.custAddressLine2 = custAddressLine2;
    }

    public String getCustPostCode() {
        return custPostCode;
    }

    public void setCustPostCode(String custPostCode) {
        this.custPostCode = custPostCode;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public double getCurrentCredit() {
        return currentCredit;
    }

    public void setCurrentCredit(double currentCredit) {
        this.currentCredit = currentCredit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
}