package ModuleE;

public interface BillInterface {
    
    public String getOrder_id();
    public void setOrder_id(String order_id);
    public void setPickUpPrice(int pickupPrice);
    public int getPickUpPrice();
    public void setStatePrice(int statePrice);
    public int getStatePrice();
    public void setStylePrice(int stylePrice);
    public int getStylePrice();
    public void setSizePrice(int sizePrice);
    public int getSizePrice();
    public void setFlowerPrice(int flowerPrice);
    public int getFlowerPrice();
    public void setAccessoriesPrice(int accessoriesPrice);
    public int getAccessoriesPrice();
    public void setPriorityPrice(int priorityPrice);
    public int getPriorityPrice();
    
    public int totalBill();
    public String billList();
}
