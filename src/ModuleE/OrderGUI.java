package ModuleE;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OrderGUI extends javax.swing.JFrame {

    private Queue<Order> orderqueue = new ArrayBlockingQueue<>(20);
    private String custType = "Normal";
    private String timestamp = "Pending";
    private String payStatus = "Pending";
    
    public OrderGUI() {
        initComponents();
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
        jcbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Express (Within 3 days)", "Normal (Within 7 days)", "Flexi  (Within 10 days)", " " }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCheckOrder)
                    .addComponent(jbtOrder)
                    .addComponent(jbtCancel)
                    .addComponent(jbtClose))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOrderActionPerformed
        String name = taCustName.getText();
        String style = jcbStyle.getSelectedItem().toString();
        String size = jcbSize.getSelectedItem().toString();
        String flower = jcbFlower.getSelectedItem().toString();
        String accessories = jcbAccessories.getSelectedItem().toString();
        String priority = jcbPriority.getSelectedItem().toString();
        
        orderqueue.offer(new Order(name,custType,style,size,flower,accessories,priority,timestamp,payStatus));
    }//GEN-LAST:event_jbtOrderActionPerformed

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
        JOptionPane.showMessageDialog(null, formatList());
    }//GEN-LAST:event_jbtCheckOrderActionPerformed

    private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
        try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
      out.writeObject(orderqueue);
     
      this.dispose();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbtCloseActionPerformed

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCancelActionPerformed

    public String formatList() {
    String outputStr = "";
    
    return outputStr;
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
}
