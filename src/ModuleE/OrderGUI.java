package ModuleE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OrderGUI extends javax.swing.JFrame {

    Date date = new Date();
    Date extdate = addDays(date,0);
    
    private QueueArray<Order> orderqueue = new QueueArray<>();
    private String custType = "Normal";
    private String timestamp = "Pending";
    private String payStatus = "Pending";
     
    public OrderGUI() {
        initComponents();
        readFile();
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
        jbtClose = new javax.swing.JButton();
        taCustName = new javax.swing.JTextField();
        jlCustName = new javax.swing.JLabel();
        jbtCheckOrder = new javax.swing.JButton();
        jbtCancel = new javax.swing.JButton();

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
        jcbStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Elliptical", "Vertical", "Horizontal", "Triangular ", "‘S’ shaped", "Oval shaped", "Cascade " }));

        jcbSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Small", "Medium", "Large" }));

        jcbFlower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Rose", "Sakura", " " }));

        jcbAccessories.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAccessories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Bear", "Tiger", "Diamond", "Jewel", "Money" }));

        jcbPriority.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Express (Within 3 days)", "Normal (Within 7 days)", "Flexi  (Within 10 days)", "" }));

        jbtOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtOrder.setText("Place Order");
        jbtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOrderActionPerformed(evt);
            }
        });

        jbtClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtClose.setText("Close Order");
        jbtClose.setActionCommand("");
        jbtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCloseActionPerformed(evt);
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

        jbtCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtCancel.setText("Cancel");
        jbtCancel.setActionCommand("");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jbtOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtCheckOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jlCustName)
                                .addGap(18, 18, 18)
                                .addComponent(taCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbStyle)
                                    .addComponent(jlbFlower)
                                    .addComponent(jlbAccessories)
                                    .addComponent(jlbPriority)
                                    .addComponent(jlbSize))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbFlowerShop)
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jlbTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCustName))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtCancel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtCheckOrder)
                        .addComponent(jbtOrder)
                        .addComponent(jbtClose)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOrderActionPerformed
        
        if(taCustName.getText().equals("") || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
        String name = taCustName.getText();
        String style = jcbStyle.getSelectedItem().toString();
        String size = jcbSize.getSelectedItem().toString();
        String flower = jcbFlower.getSelectedItem().toString();
        String accessories = jcbAccessories.getSelectedItem().toString();
        
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
        orderqueue.enqueue(new Order(name,custType,style,size,flower,accessories,timestamp,payStatus,orderDate));
        JOptionPane.showMessageDialog(new JFrame(), "Order Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); 
        
        
    }//GEN-LAST:event_jbtOrderActionPerformed

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
        
        if(taCustName.getText().equals("") || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0){
         
        JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
        else{
            
            JOptionPane.showMessageDialog(null, billList());
        }
    }//GEN-LAST:event_jbtCheckOrderActionPerformed

    private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
    
    if(taCustName.getText().equals("") || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0){
         
        JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    else{
        writeFile();
    }
    }//GEN-LAST:event_jbtCloseActionPerformed

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCancelActionPerformed

    public String billList() {
    
        String outputStr = "Your Name : " + taCustName.getText() + "\nStyle : " +jcbStyle.getSelectedItem().toString()+ "\nSize : " +jcbSize.getSelectedItem().toString()+ 
                "\nFlower Type : " +jcbFlower.getSelectedItem().toString()+ "\nAccessories : " + jcbAccessories.getSelectedItem().toString()+ 
                "\nPriority : " +jcbPriority.getSelectedItem().toString() + "\n\nYour Bill : ";
    
        return outputStr;
  }
    
    private void readFile(){
        try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));
        orderqueue = (QueueArray) in.readObject();
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
            out.writeObject(orderqueue);
            out.close();
            this.dispose();
            
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCancel;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtClose;
    private javax.swing.JButton jbtOrder;
    private javax.swing.JComboBox<String> jcbAccessories;
    private javax.swing.JComboBox<String> jcbFlower;
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
