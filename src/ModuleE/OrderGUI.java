package ModuleE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OrderGUI extends javax.swing.JFrame {

    Date date = new Date();
    Date extdate = addDays(date,0);
    
    BillInterface bill = new Bill();
    
    private LinkedQueue<Order> tmpqueue = new LinkedQueue<>();
    private LinkedQueue<Order> orderqueue = new LinkedQueue<>();
    
    private LinkedQueue<Order> expressorder = new LinkedQueue<>();
    private LinkedQueue<Order> normalorder = new LinkedQueue<>();
    private LinkedQueue<Order> flexiorder = new LinkedQueue<>();
    
    private Order order = new Order();
    private String custType = "Normal";
    private String timestamp = "Pending";
    private String payStatus = "Pending";
    private String orderStatus = "Wait to Pick Up";
     
    public OrderGUI() {
        initComponents();
        getID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFlowerShop = new javax.swing.JLabel();
        jlbTitle = new javax.swing.JLabel();
        jlbStyle = new javax.swing.JLabel();
        jlbSize = new javax.swing.JLabel();
        jlbFlower = new javax.swing.JLabel();
        jlbAccessories = new javax.swing.JLabel();
        jlbPriority = new javax.swing.JLabel();
        jcbStyle = new javax.swing.JComboBox<>();
        jcbSize = new javax.swing.JComboBox<>();
        jcbFlower = new javax.swing.JComboBox<>();
        jcbAccessories = new javax.swing.JComboBox<>();
        jcbPriority = new javax.swing.JComboBox<>();
        jbtOrder = new javax.swing.JButton();
        taCustName = new javax.swing.JTextField();
        jlCustName = new javax.swing.JLabel();
        jbtCheckOrder = new javax.swing.JButton();
        jlbpickUp = new javax.swing.JLabel();
        jcbPickUp = new javax.swing.JComboBox<>();
        jlbAddress1 = new javax.swing.JLabel();
        jlbAddress2 = new javax.swing.JLabel();
        jlbState = new javax.swing.JLabel();
        jlbCountry = new javax.swing.JLabel();
        jtfAddress1 = new javax.swing.JTextField();
        jtfAddress2 = new javax.swing.JTextField();
        jtfCountry = new javax.swing.JTextField();
        jcbState = new javax.swing.JComboBox<>();
        jlbPostCode = new javax.swing.JLabel();
        jtfPostCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFlowerShop.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jlbFlowerShop.setText("FIORE FLOWERSHOP");

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setText("Customized Floral Arrangements");

        jlbStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbStyle.setText("Step 1 : Please Select Your Flower Arrangement Style");

        jlbSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbSize.setText("Step 2 : Please Select Your Flower Arrangement Size");

        jlbFlower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbFlower.setText("Step 3 : Please Select Your Flowers");

        jlbAccessories.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbAccessories.setText("Step 4 : Please Select Your Accessories");

        jlbPriority.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbPriority.setText("Final Step : Please Select Your Pick-Up Priority");

        jcbStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Elliptical  (+ RM 10)", "Vertical (+ RM 10)", "Horizontal (+ RM 10)", "Triangular  (+ RM 20)", "‘S’ shaped (+ RM 20)", "Oval shaped (+ RM 30)", "Cascade  (+ RM 30)" }));

        jcbSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Small  (+ RM 10)", "Medium  (+ RM 20)", "Large (+ RM 30)" }));

        jcbFlower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Hybrid Tea (+ RM 30)", "Pernetiana  (+ RM 30)", "Polyantha  (+ RM 30)", "Floribunda  (+ RM 30)", "Grandiflora (+ RM 40)", "Miniature (+ RM 40)", "Climbing and Rambling (+ RM 40)", "Shrub Roses (+ RM 50)", "English/David Austin (+ RM 50)", "Canadian Hardy (+ RM 60)", "Landscape (+ RM 70)", "Patio Roses (+ RM 70)" }));

        jcbAccessories.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAccessories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Bear (+ RM 20)", "Tiger (+ RM 40)", "Diamond (+ RM 60)", "Jewel (+ RM 80)", "Money (+ RM 100)" }));

        jcbPriority.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Express (Within 3 days)  (+ RM 50)", "Normal (Within 7 days) (+ RM 30)", "Flexi  (Within 10 days) (+ RM 10)" }));

        jbtOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtOrder.setText("Place Order");
        jbtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOrderActionPerformed(evt);
            }
        });

        taCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCustName.setText("Full Name");

        jbtCheckOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtCheckOrder.setText("Check Bill");
        jbtCheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckOrderActionPerformed(evt);
            }
        });

        jlbpickUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbpickUp.setText("Pick-Up Selection");

        jcbPickUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPickUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Self Pick-Up (+ RM 0)", "Delivery (+ RM 10)" }));

        jlbAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbAddress1.setText("Address Line 1");

        jlbAddress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbAddress2.setText("Address Line 2");

        jlbState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbState.setText("State");

        jlbCountry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbCountry.setText("Country");

        jtfAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfAddress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfCountry.setEditable(false);
        jtfCountry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCountry.setText("Malaysia");

        jcbState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Selangor", "Kuala Lumpur", "Johor", "Penang", "Perak", "Pahang", "Negeri Sembilan", "Kedah", "Melaka", "Terengganu", "Kelantan", "Perlis", "Sabah (+ RM 10)", "Sarawak (+ RM 10)" }));

        jlbPostCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbPostCode.setText("Post Code");

        jtfPostCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jlbTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbAddress1)
                    .addComponent(jlCustName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jtfAddress1))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbState)
                            .addComponent(jlbCountry))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtOrder)
                            .addComponent(jlbStyle)
                            .addComponent(jlbFlower)
                            .addComponent(jlbAccessories)
                            .addComponent(jlbPriority)
                            .addComponent(jlbSize))
                        .addGap(18, 18, 18)
                        .addComponent(jbtCheckOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlbFlowerShop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jlbpickUp)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbPriority, 0, 265, Short.MAX_VALUE)
                                .addComponent(jcbStyle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbFlower, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbAccessories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbPostCode)
                            .addComponent(jlbAddress2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfPostCode)
                                .addGap(181, 181, 181)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCustName))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddress1)
                    .addComponent(jtfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAddress2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPostCode, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jlbPostCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbState, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbState))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCountry))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbpickUp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbStyle)
                    .addComponent(jcbStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSize)
                    .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFlower)
                    .addComponent(jcbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbAccessories)
                    .addComponent(jcbAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbPriority)
                    .addComponent(jcbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOrder)
                    .addComponent(jbtCheckOrder))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOrderActionPerformed
        
        readFile();
        
        int num = getID();
        
        while(!orderqueue.isEmpty()){
            order = orderqueue.dequeue();
            
            if(order.getPriority().toString().equals("Express (Within 3 days)  (+ RM 50)")){
                expressorder.enqueue(order);
            }
            
            if(order.getPriority().toString().equals("Normal (Within 7 days) (+ RM 30)")){
                normalorder.enqueue(order);
            }
            
            if(order.getPriority().toString().equals("Flexi  (Within 10 days) (+ RM 10)")){
                flexiorder.enqueue(order);
            }
        }
        
        if(taCustName.getText().equals("") || jcbPickUp.getSelectedIndex() == 0 || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0 || jtfAddress1.getText() == "" || jtfAddress2.getText() == "" || jcbState.getSelectedIndex() == 0 || jtfPostCode.getText() == ""){            
                JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
        else{
            String ID = generateId(num);
            String name = taCustName.getText();
            String address1 = jtfAddress1.getText();
            String address2 = jtfAddress2.getText();
            String postCode = jtfPostCode.getText();
            String state = jcbState.getSelectedItem().toString();
            String country = jtfCountry.getText();
            String pickuptype = jcbPickUp.getSelectedItem().toString();
            
            String style = jcbStyle.getSelectedItem().toString();
            String size = jcbSize.getSelectedItem().toString();
            String flower = jcbFlower.getSelectedItem().toString();
            String accessories = jcbAccessories.getSelectedItem().toString();
            String priority = jcbPriority.getSelectedItem().toString();
        
            bill.setID(ID);
            bill.setName(name);
            bill.setAddress1(address1);
            bill.setAddress2(address2);
            bill.setPostCode(postCode);
            bill.setState(state);
            bill.setCountry(country);
            bill.setPickUp(pickuptype);
            bill.setStyle(style);
            bill.setSize(size);
            bill.setFlower(flower);
            bill.setAccessories(accessories);
            bill.setPriority(priority);
        
        if(jcbPriority.getSelectedIndex() == 1)
        {
            extdate = addDays(date,3);
        }
        else if(jcbPriority.getSelectedIndex() == 2)
        {
            extdate = addDays(date,7);
        }
        else if(jcbPriority.getSelectedIndex() == 3)
        {
            extdate = addDays(date,10);
        }
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String orderDate = dateFormat.format(extdate);
        
        if(jcbPriority.getSelectedIndex() == 1)
        {
            expressorder.enqueue(new Order(ID,name,address1,address2,postCode,state,country,pickuptype,custType,style,size,flower,accessories,timestamp,payStatus,orderDate,orderStatus,priority));
        }
        else if(jcbPriority.getSelectedIndex() == 2)
        {
            normalorder.enqueue(new Order(ID,name,address1,address2,postCode,state,country,pickuptype,custType,style,size,flower,accessories,timestamp,payStatus,orderDate,orderStatus,priority));
        }
        else if(jcbPriority.getSelectedIndex() == 3)
        {
            flexiorder.enqueue(new Order(ID,name,address1,address2,postCode,state,country,pickuptype,custType,style,size,flower,accessories,timestamp,payStatus,orderDate,orderStatus,priority));
        }
        
        if(!expressorder.isEmpty()){
            while(!expressorder.isEmpty()){
                order = expressorder.dequeue();
                orderqueue.enqueue(order);
            }
        }
        
        if(!normalorder.isEmpty()){
            while(!normalorder.isEmpty()){
                order = normalorder.dequeue();
                orderqueue.enqueue(order);
            }
        }
        
        if(!flexiorder.isEmpty()){
            while(!flexiorder.isEmpty()){
                order = flexiorder.dequeue();
                orderqueue.enqueue(order);
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Order Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); 
        
        writeFile();
    }
        
    }//GEN-LAST:event_jbtOrderActionPerformed

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
        
        
        if(bill.getID() == null){
            JOptionPane.showMessageDialog(null, "You haven't place any order yet !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            if(jcbPriority.getSelectedIndex() == 1)
        {
            extdate = addDays(date,3);
            bill.setPriorityPrice(50);
        }
        else if(jcbPriority.getSelectedIndex() == 2)
        {
            extdate = addDays(date,7);
            bill.setPriorityPrice(30);
        }
        else if(jcbPriority.getSelectedIndex() == 3)
        {
            extdate = addDays(date,10);
            bill.setPriorityPrice(10);
        }
        
        if(jcbPickUp.getSelectedIndex() == 2){
            bill.setPickUpPrice(10);
        }
        else
        {
            bill.setPickUpPrice(0);
        }
        
        if(jcbState.getSelectedIndex() == 13 || jcbState.getSelectedIndex() == 14)
        {
            bill.setStatePrice(10);
        }
        
        if(jcbStyle.getSelectedIndex() == 1 || jcbStyle.getSelectedIndex() == 2 || jcbStyle.getSelectedIndex() == 3){
            bill.setStylePrice(10);
        }
        else if(jcbStyle.getSelectedIndex() == 4 || jcbStyle.getSelectedIndex() == 5){
            bill.setStylePrice(20);
        }
        else{
            bill.setStylePrice(30);
        }
        
        if(jcbSize.getSelectedIndex() == 1){
            bill.setSizePrice(10);
        }
        else if(jcbSize.getSelectedIndex() == 2){
            bill.setSizePrice(20);
        }
        else{
            bill.setSizePrice(30);
        }
        
        if(jcbFlower.getSelectedIndex() == 1 || jcbFlower.getSelectedIndex() == 2 || jcbFlower.getSelectedIndex() == 3 || jcbFlower.getSelectedIndex() == 4){
            bill.setFlowerPrice(30);
        }
        else if(jcbFlower.getSelectedIndex() == 5 || jcbFlower.getSelectedIndex() == 6 || jcbFlower.getSelectedIndex() == 7){
            bill.setFlowerPrice(40);
        }
        else if(jcbFlower.getSelectedIndex() == 8 || jcbFlower.getSelectedIndex() == 9){
            bill.setFlowerPrice(50);
        }
        else if(jcbFlower.getSelectedIndex() == 10){
            bill.setFlowerPrice(60);
        }
        else if(jcbFlower.getSelectedIndex() == 11 || jcbFlower.getSelectedIndex() == 12){
            bill.setFlowerPrice(70);
        }
        
        if(jcbAccessories.getSelectedIndex() == 1){
            bill.setAccessoriesPrice(20);
        }
        else if(jcbAccessories.getSelectedIndex() == 2){
            bill.setAccessoriesPrice(40);
        }
        else if(jcbAccessories.getSelectedIndex() == 3){
            bill.setAccessoriesPrice(60);
        }
        else if(jcbAccessories.getSelectedIndex() == 4){
            bill.setAccessoriesPrice(80);
        }
        else{
            bill.setAccessoriesPrice(100);
        }
        
            JOptionPane.showMessageDialog(null, bill.billList());
        }
    }//GEN-LAST:event_jbtCheckOrderActionPerformed
    
    private void readFile(){
        try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));
        ArrayList<Order> tmp = new ArrayList<Order>();
        tmp = (ArrayList)in.readObject();
        
        for(int i=0; i<tmp.size(); i++)
            {
                order = tmp.get(i);
                orderqueue.enqueue(order);
            }
        
        in.close();
        
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void writeFile(){
        try {
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
            ArrayList tmp = new ArrayList();
            
            while(!orderqueue.isEmpty())
            {
                order = orderqueue.dequeue();
                tmp.add(order);
            }
            
            out.writeObject(tmp);
            out.close();
            
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public int getID(){

        int num = 0;
        while(!orderqueue.isEmpty())
            {
                order = orderqueue.dequeue();
                tmpqueue.enqueue(order);
                num++;
            }
           
        while(!tmpqueue.isEmpty())
        {
            order = tmpqueue.dequeue();
            orderqueue.enqueue(order);
        }

        return num;
    }
    
    public String generateId(int num){
        String id = null;
        num++;
        String tempNum = Integer.toString(num);
        
        if (tempNum.length() < 6 && tempNum.length() > 0){
            if (tempNum.length() > 1){
                if (tempNum.length() > 2){
                    if (tempNum.length() > 3){
                        if (tempNum.length() > 4){
                            id = "C" + tempNum;
                        }
                        else {
                            id = "C0" + tempNum;
                        }
                    }
                    else {
                        id = "C00" + tempNum;
                    }
                }
                else {
                    id = "C000" + tempNum;
                }
            }
            else {
                id = "C0000" + tempNum;
            }
        }
        else{
            id = "C00001";
        }
        
        return id;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtOrder;
    private javax.swing.JComboBox<String> jcbAccessories;
    private javax.swing.JComboBox<String> jcbFlower;
    private javax.swing.JComboBox<String> jcbPickUp;
    private javax.swing.JComboBox<String> jcbPriority;
    private javax.swing.JComboBox<String> jcbSize;
    private javax.swing.JComboBox<String> jcbState;
    private javax.swing.JComboBox<String> jcbStyle;
    private javax.swing.JLabel jlCustName;
    private javax.swing.JLabel jlbAccessories;
    private javax.swing.JLabel jlbAddress1;
    private javax.swing.JLabel jlbAddress2;
    private javax.swing.JLabel jlbCountry;
    private javax.swing.JLabel jlbFlower;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbPostCode;
    private javax.swing.JLabel jlbPriority;
    private javax.swing.JLabel jlbSize;
    private javax.swing.JLabel jlbState;
    private javax.swing.JLabel jlbStyle;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlbpickUp;
    private javax.swing.JTextField jtfAddress1;
    private javax.swing.JTextField jtfAddress2;
    private javax.swing.JTextField jtfCountry;
    private javax.swing.JTextField jtfPostCode;
    private javax.swing.JTextField taCustName;
    // End of variables declaration//GEN-END:variables

    private Date addDays(Date date, int i) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
	cal.add(Calendar.DATE, i);
				
	return cal.getTime();
    }
}
