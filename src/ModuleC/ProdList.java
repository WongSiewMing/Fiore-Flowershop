package ModuleC;

import ModuleA.Product;
import java.io.Serializable;

public class ProdList implements Serializable {

    @Override
    public String toString() {
        return prodListID+"ProdList{" + "order_id=" + order_id + ", product=" + product + ", quantity=" + quantity + '}';
    }

    public  int prodListID;
    public String order_id;
    public Product product;
    public int quantity;

    public ProdList() {
        
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getProdListID() {
        return prodListID;
    }

    public void setProdListID(int prodListID) {
        this.prodListID = prodListID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
