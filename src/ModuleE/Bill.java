package ModuleE;

public class Bill implements BillInterface{
    
    private String order_id;
    private int pickUpPrice;
    private int statePrice;
    private int stylePrice;
    private int sizePrice;
    private int flowerPrice;
    private int accessoriesPrice;
    private int priorityPrice;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getPickUpPrice() {
        return pickUpPrice;
    }

    public void setPickUpPrice(int pickUpPrice) {
        this.pickUpPrice = pickUpPrice;
    }
    
    public int getStatePrice() {
        return statePrice;
    }

    public void setStatePrice(int statePrice) {
        this.statePrice = statePrice;
    }

    public int getStylePrice() {
        return stylePrice;
    }

    public void setStylePrice(int stylePrice) {
        this.stylePrice = stylePrice;
    }

    public int getSizePrice() {
        return sizePrice;
    }

    public void setSizePrice(int sizePrice) {
        this.sizePrice = sizePrice;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(int flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public int getAccessoriesPrice() {
        return accessoriesPrice;
    }

    public void setAccessoriesPrice(int accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }

    public int getPriorityPrice() {
        return priorityPrice;
    }

    public void setPriorityPrice(int priorityPrice) {
        this.priorityPrice = priorityPrice;
    }
    
    public int totalBill()
    {
        int totalBill = getAccessoriesPrice() + getFlowerPrice() + getPickUpPrice() + getPriorityPrice() + getSizePrice() + getStylePrice() + getStatePrice();
        
        return totalBill;
    }
    
    public String billList()
    {
        return "Order ID : " + order_id + "\n\nTotal Amount : RM " + totalBill();
    }
}
