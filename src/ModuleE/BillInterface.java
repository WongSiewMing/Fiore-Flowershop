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
    
    public String billList();
}
