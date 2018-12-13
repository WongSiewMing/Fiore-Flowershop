
package ModuleA;

import java.io.Serializable;


public class Product implements Serializable{
    private String prod_id;
    private String prod_name;
    private String prod_desc;
    private String prod_type;
    private double price;
    private int quantity;
    private Promotion promotion;
    
    public Product(){
        
    }
    
    public Product(String prod_id, String prod_name, String prod_desc, String prod_type, double price, int quantity, Promotion promotion){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_type = prod_type;
        this.price = price;
        this.quantity = quantity;
        this.promotion = promotion;
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
    
    public Promotion getPromotion(){
        return promotion;
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
    
    public void setPromotion(Promotion promotion){
        this.promotion = promotion;
    }
    
    public String toString() {
        return String.format("%s %s %s %s %f %d", prod_id, prod_name, prod_desc, prod_type, price, quantity);
      }
}
