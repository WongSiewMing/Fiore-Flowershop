package ModuleD;

import ModuleE.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateDelivery extends javax.swing.JPanel {

    private LinkedQueue<Order> deliveryQueue = new LinkedQueue<>();
    private Order delivery = new Order();
    private Order deliveryList = new Order();
    LinkedList<Order> custDelivery = new LinkedList<>();
    LocalTime now = LocalTime.now(); 
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
    
    public UpdateDelivery() {
        initComponents();
        getDelivery();  
        transferList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSelectDelivery = new javax.swing.JLabel();
        jSelectPayment = new javax.swing.JLabel();
        jcbDelivery = new javax.swing.JComboBox<>();
        jcbPayment = new javax.swing.JComboBox<>();
        jbtUpdate = new javax.swing.JButton();

        jSelectDelivery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSelectDelivery.setText("Select Delivery");

        jSelectPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSelectPayment.setText("Select Payment Type");

        jcbDelivery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbDelivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        jcbPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Cash On Delivery", "Credit Card", "Touch & Go" }));

        jbtUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtUpdate.setText("Update");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSelectDelivery)
                            .addComponent(jSelectPayment))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jbtUpdate)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectDelivery)
                    .addComponent(jcbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectPayment)
                    .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jbtUpdate)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
        if(jcbDelivery.getSelectedIndex() == 0 || jcbPayment.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0; i < custDelivery.getNumberOfEntries(); i ++)
            {
                if(jcbDelivery.getSelectedItem().toString().equals(custDelivery.getEntry(i).getOrderID().toString()+ " || " +custDelivery.getEntry(i).getCustName().toString())){
                    delivery = custDelivery.getEntry(i);
                    delivery.setOrderStatus("Picked Up");
                    delivery.setPaymentStatus(jcbPayment.getSelectedItem().toString());
                    delivery.setTimestamp(now.format(dtf));
                    transferQueue();
                    writeFile();
                    JOptionPane.showMessageDialog(new JFrame(), "Update Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
    }//GEN-LAST:event_jbtUpdateActionPerformed


    private void getDelivery(){
        initializeList();
        
        while(deliveryQueue.isEmpty() != true ){
            delivery = deliveryQueue.dequeue();
            
            if(delivery.getPickUpType().toString().equals("Delivery (+ RM 10)")){
                    jcbDelivery.addItem(delivery.getOrderID() + " || " +delivery.getCustName());
            }
        }
            
    }

    private void transferList(){
        
        initializeList();
        
        for(int i = 0; deliveryQueue.isEmpty() != true; i++ ){
            custDelivery.add(i,deliveryQueue.dequeue());
        }
    }
    
    private void transferQueue(){
        
        for(int i = 0; i < custDelivery.getNumberOfEntries() ; i ++){
            deliveryQueue.enqueue(custDelivery.getEntry(i));
        }
    }
    
    private void initializeList() {
     
        try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));

        ArrayList<Order> tmp = new ArrayList<Order>();
        tmp = (ArrayList)in.readObject();
        
        for(int i=0; i<tmp.size(); i++)
            {
                deliveryList = tmp.get(i);
                deliveryQueue.enqueue(deliveryList);
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
            
            while(!deliveryQueue.isEmpty())
            {
                deliveryList = deliveryQueue.dequeue();
                tmp.add(deliveryList);
            }
            
            out.writeObject(tmp);
            out.close();
            
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jSelectDelivery;
    private javax.swing.JLabel jSelectPayment;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JComboBox<String> jcbDelivery;
    private javax.swing.JComboBox<String> jcbPayment;
    // End of variables declaration//GEN-END:variables
}
