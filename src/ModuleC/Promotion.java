
package ModuleC;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable{
    private Date start_date;
    private Date end_date;
    private double discount_price;
    
    public Promotion(){
        
    }
    
    public Promotion(Date start_date, Date end_date, double discount_price){
        this.start_date = start_date;
        this.end_date = end_date;
        this.discount_price = discount_price;
    }
    
    public Date getStart_date(){
        return start_date;
    }
    
    public Date getEnd_date(){
        return end_date;
    }
    
    public double getDiscount_price(){
        return discount_price;
    }
    
    public void setStart_date(Date start_date){
        this.start_date = start_date;
    }
    
    public void setEnd_date(Date end_date){
        this.end_date = end_date;
    }
    
    public void setDiscount_price(double discount_price){
        this.discount_price = discount_price;
    }
    
    public String toString(){
        return String.format("%s %s %f", start_date, end_date, discount_price);
    }
}
