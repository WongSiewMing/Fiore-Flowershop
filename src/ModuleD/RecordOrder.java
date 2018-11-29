package ModuleD;

import ModuleE.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class RecordOrder extends javax.swing.JPanel {

    private ModuleE.QueueArray<Order> orderqueue = new ModuleE.QueueArray<>(20);
    private Order order = new Order();
    List<Order> custorder = new ArrayList<>();
    LocalTime now = LocalTime.now(); 
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
    
    public RecordOrder() {
        initComponents();
        getOrder();  
        transferList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSelectOrder = new javax.swing.JLabel();
        jlPaymentType = new javax.swing.JLabel();
        jcbOrder = new javax.swing.JComboBox<>();
        jcbPaymentType = new javax.swing.JComboBox<>();
        jbtRecord = new javax.swing.JButton();

        jlSelectOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlSelectOrder.setText("Select Order");

        jlPaymentType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPaymentType.setText("Select Payment Type");

        jcbOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        jcbPaymentType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Cash On Delivery", "Cash", "Credit Card", "Touch & Go" }));

        jbtRecord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtRecord.setText("Record");
        jbtRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPaymentType)
                            .addComponent(jlSelectOrder))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jbtRecord)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelectOrder)
                    .addComponent(jcbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPaymentType)
                    .addComponent(jcbPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jbtRecord)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordActionPerformed
        
        if(jcbOrder.getSelectedIndex() == 0 || jcbPaymentType.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0; i < custorder.size(); i ++)
            {
                if(jcbOrder.getSelectedItem().toString().equals(custorder.get(i).getCustName().toString())){
                    order = custorder.get(i);
                    order.setOrderStatus("Picked Up");
                    order.setPaymentStatus(jcbPaymentType.getSelectedItem().toString());
                    order.setTimestamp(now.format(dtf));
                }
            }
            
        }
        transferQueue();
        writeFile();
        JOptionPane.showMessageDialog(new JFrame(), "Record Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jbtRecordActionPerformed

    private void getOrder(){
        initializeList();
        
        while(orderqueue.isEmpty() != true ){
            order = orderqueue.dequeue();
            jcbOrder.addItem(order.getCustName());
        }
    }

    private void transferList(){
        
        initializeList();
        
        for(int i = 0; orderqueue.isEmpty() != true; i++ ){
            custorder.add(i,orderqueue.dequeue());
        }
    }
    
    private void transferQueue(){
        
        for(int i = 0; i < custorder.size(); i ++){
            orderqueue.enqueue(custorder.get(i));
        }
    }
    
    private void initializeList() {
     
        try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));

        orderqueue = (ModuleE.QueueArray) in.readObject();
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
            
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtRecord;
    private javax.swing.JComboBox<String> jcbOrder;
    private javax.swing.JComboBox<String> jcbPaymentType;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlSelectOrder;
    // End of variables declaration//GEN-END:variables
}

