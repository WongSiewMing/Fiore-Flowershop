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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbPickUp = new javax.swing.JComboBox<>();
        jcbLocation = new javax.swing.JComboBox<>();

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
        jbtCheckOrder.setText("Check Order");
        jbtCheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pick-Up Location (If Delivery)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pick-Up Selection");

        jcbPickUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPickUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Self Pick-Up (+ RM 0)", "Delivery (+ RM 10)" }));

        jcbLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "TBR Orange Cyble Cafe", "TBR Red Sea Cyble Cafe", "TBR Family Mart", "TBR 99 SpeedMart", "Ampang Red Sea Cyble Cafe", "Ampang Family Mart", "Ampang 99 SpeedMart", "Ampang Giant Mall" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCustName)
                .addGap(18, 18, 18)
                .addComponent(taCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jlbTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtOrder)
                            .addComponent(jlbStyle)
                            .addComponent(jlbFlower)
                            .addComponent(jlbAccessories)
                            .addComponent(jlbPriority)
                            .addComponent(jlbSize)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtCheckOrder)
                                    .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbPriority, 0, 265, Short.MAX_VALUE)
                                    .addComponent(jcbLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbStyle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFlower, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbAccessories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlbFlowerShop)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOrderActionPerformed
        
        readFile();
        
        if(taCustName.getText().equals("") || jcbPickUp.getSelectedIndex() == 0 || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0 || (jcbPickUp.getSelectedIndex() == 2 && jcbLocation.getSelectedIndex() == 0)){            
                JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
        else{
            String ID = generateId(getID());
            String name = taCustName.getText();
            String location = jcbLocation.getSelectedItem().toString();
            String pickuptype = jcbPickUp.getSelectedItem().toString();
            String style = jcbStyle.getSelectedItem().toString();
            String size = jcbSize.getSelectedItem().toString();
            String flower = jcbFlower.getSelectedItem().toString();
            String accessories = jcbAccessories.getSelectedItem().toString();
            String priority = jcbPriority.getSelectedItem().toString();
        
            bill.setID(ID);
            bill.setName(name);
            bill.setLocation(location);
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
        orderqueue.enqueue(new Order(ID,name,location,pickuptype,custType,style,size,flower,accessories,timestamp,payStatus,orderDate,orderStatus));
        JOptionPane.showMessageDialog(new JFrame(), "Order Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); 
        
        writeFile();
    }
        
    }//GEN-LAST:event_jbtOrderActionPerformed

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
        
        if(taCustName.getText().equals("") || jcbPickUp.getSelectedIndex() == 0 || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0|| (jcbPickUp.getSelectedIndex() == 2 && jcbLocation.getSelectedIndex() == 0)){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
    }
        else{
            
            String ID = generateId(getID());
            String name = taCustName.getText();
            String location = jcbLocation.getSelectedItem().toString();
            String pickuptype = jcbPickUp.getSelectedItem().toString();
            String style = jcbStyle.getSelectedItem().toString();
            String size = jcbSize.getSelectedItem().toString();
            String flower = jcbFlower.getSelectedItem().toString();
            String accessories = jcbAccessories.getSelectedItem().toString();
            String priority = jcbPriority.getSelectedItem().toString();
        
            bill.setID(ID);
            bill.setName(name);
            bill.setLocation(location);
            bill.setPickUp(pickuptype);
            bill.setStyle(style);
            bill.setSize(size);
            bill.setFlower(flower);
            bill.setAccessories(accessories);
            bill.setPriority(priority);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtOrder;
    private javax.swing.JComboBox<String> jcbAccessories;
    private javax.swing.JComboBox<String> jcbFlower;
    private javax.swing.JComboBox<String> jcbLocation;
    private javax.swing.JComboBox<String> jcbPickUp;
    private javax.swing.JComboBox<String> jcbPriority;
    private javax.swing.JComboBox<String> jcbSize;
    private javax.swing.JComboBox<String> jcbStyle;
    private javax.swing.JLabel jlCustName;
    private javax.swing.JLabel jlbAccessories;
    private javax.swing.JLabel jlbFlower;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbPriority;
    private javax.swing.JLabel jlbSize;
    private javax.swing.JLabel jlbStyle;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTextField taCustName;
    // End of variables declaration//GEN-END:variables

    private Date addDays(Date date, int i) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
	cal.add(Calendar.DATE, i);
				
	return cal.getTime();
    }
}
