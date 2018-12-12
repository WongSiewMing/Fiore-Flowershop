
package ModuleC;

import java.io.Serializable;


public class Order implements Serializable{
    
    private String order_id;
    private Customer customer;
    private LinkedList<Product> prod_list = new LinkedList<Product>();
    private String collect_method;
    private String payment_method;
    private double total_payment;
    
    public Order(){
        
    }
    
    public String getOrderId(){
        return order_id;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public LinkedList<Product> getProdList(){
        return prod_list;
    }
    
    public String getCollectMethod(){
        return collect_method;
    }
    
    public String getPaymentMethod(){
        return payment_method;
    }
    
    public double getTotalPayment(){
        return total_payment;
    }
    
    public void setOrderId(String order_id){
        this.order_id = order_id;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setProdList(LinkedList<Product> prod_list){
        this.prod_list = prod_list;
    }
    
    public void setCollectMethod(String collect_method){
        this.collect_method = collect_method;
    }
    
    public void setPaymentMethod(String payment_method){
        this.payment_method = payment_method;
    }
    
    public void setTotalPayment(double total_payment){
        this.total_payment = total_payment;
    }
}
