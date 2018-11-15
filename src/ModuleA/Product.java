
package ModuleA;

import java.io.Serializable;


public class Product implements Serializable{
    private int prod_id;
    private String prod_name;
    private String prod_desc;
    private String prod_type;
    private double price;
    private int quantity;
    
    public Product(){
        
    }
    
    public int getProd_id(){
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
    
    public void setProd_id(){
        this.prod_id = prod_id;
    }
    
    public void setProd_name(){
        this.prod_name = prod_name;
    }
    
    public void setProd_desc(){
        this.prod_desc = prod_name;
    }
    
    public void setProd_type(){
        this.prod_type = prod_type;
    }
    
    public void setPrice(){
        this.price = price;
    }
    
    public void setQuantity(){
        this.quantity = quantity;
    }
}
