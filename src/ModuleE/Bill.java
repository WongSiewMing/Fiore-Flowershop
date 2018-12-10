package ModuleE;

public class Bill implements BillInterface{
    private String ID;
    private String name;
    private String location;
    private String pickUp;
    private String style;
    private String size;
    private String flower;
    private String accessories;
    private String priority;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    public String billList()
    {
        return "Order ID : " + ID + "\nYour Name : " + name + "\nPick-Up Type : " +pickUp+ "\nPick-Up Location : " +location+ 
                "\nStyle : " +style+ "\nSize : " +size+ 
                "\nFlower Type : " +flower+ "\nAccessories : " + accessories+ 
                "\nPriority : " +priority + "\n\nYour Bill : ";
    }
}
