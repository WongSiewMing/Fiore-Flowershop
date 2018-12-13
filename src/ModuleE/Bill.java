package ModuleE;

public class Bill implements BillInterface{
    private String ID;
    private String name;
    private String address1;
    private String address2;
    private String postCode;
    private String state;
    private String country;
    private String pickUp;
    private String style;
    private String size;
    private String flower;
    private String accessories;
    private String priority;
    
    private int pickUpPrice;
    private int statePrice;
    private int stylePrice;
    private int sizePrice;
    private int flowerPrice;
    private int accessoriesPrice;
    private int priorityPrice;

    public String getID() {
        return ID;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStatePrice() {
        return statePrice;
    }

    public void setStatePrice(int statePrice) {
        this.statePrice = statePrice;
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

    public int getPickUpPrice() {
        return pickUpPrice;
    }

    public void setPickUpPrice(int pickUpPrice) {
        this.pickUpPrice = pickUpPrice;
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
        return "Order ID : " + ID + "\n\nYour Name : " + name + 
                "\nAddress : \n" +address1+ "\n" +address2+ "\n" + postCode+ "\n"+state+
                "\n\nPick-Up Type : " +pickUp+ 
                "\nStyle : " +style+ "\nSize : " +size+ 
                "\nFlower Type : " +flower+ "\nAccessories : " + accessories+ 
                "\nPriority : " +priority + "\n\nTotal Amount : RM " + totalBill();
    }
}
