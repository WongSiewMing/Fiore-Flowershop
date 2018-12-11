package ModuleE;

public interface BillInterface {
    
    public void setID(String ID);
    public String getID();
    public void setName(String name);
    public String getName();
    public void setLocation(String location);
    public String getLocation();
    public void setPickUp(String pickup);
    public String getPickUp();
    public void setStyle(String style);
    public String getStyle();
    public void setSize(String size);
    public String getSize();
    public void setFlower(String flower);
    public String getFlower();
    public void setAccessories(String accessories);
    public String getAccessories();
    public void setPriority(String priority);
    public String getPriority();
    
    public void setPickUpPrice(int pickupPrice);
    public int getPickUpPrice();
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
