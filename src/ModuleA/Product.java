
package ModuleA;

import java.io.Serializable;


public class Product implements Serializable{
    private String prod_id;
    private String prod_name;
    private String prod_desc;
    private String prod_type;
    private double price;
    private int quantity;
    
    public Product(){
        
    }
    
    public String getProd_id(){
        return prod_id;
    }
    
    public String getProd_name(){
        return prod_name;
    }
    
    public String getProd_desc(){
        return prod_desc;
    }
    
    public String getProd_type(){
        return prod_type;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setProd_id(String prod_id){
        this.prod_id = prod_id;
    }
    
    public void setProd_name(String prod_name){
        this.prod_name = prod_name;
    }
    
    public void setProd_desc(String prod_desc){
        this.prod_desc = prod_desc;
    }
    
    public void setProd_type(String prod_type){
        this.prod_type = prod_type;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String toString() {
        return String.format("%s %s %s %s %f %d", prod_id, prod_name, prod_desc, prod_type, price, quantity);
      }
}