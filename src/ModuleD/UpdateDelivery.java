package ModuleD;

import ModuleE.Order;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateDelivery extends javax.swing.JPanel {

    
    private Order delivery = new Order();
    
    LocalTime now = LocalTime.now(); 
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
    
    OrderManagement orderManagement = new OrderManagement();
    
    public UpdateDelivery() {
        initComponents();
        getDelivery();  
        orderManagement.transferDeliveryList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentTypeGroup = new javax.swing.ButtonGroup();
        DeliveryStatusGroup = new javax.swing.ButtonGroup();
        TimeStampGroup = new javax.swing.ButtonGroup();
        jSelectDelivery = new javax.swing.JLabel();
        jSelectPayment = new javax.swing.JLabel();
        jcbDelivery = new javax.swing.JComboBox<>();
        jbtUpdate = new javax.swing.JButton();
        jlbDeliveryStatus = new javax.swing.JLabel();
        jlbTime = new javax.swing.JLabel();
        Pending = new javax.swing.JRadioButton();
        CashOnDelivery = new javax.swing.JRadioButton();
        Waiting = new javax.swing.JRadioButton();
        Delivered = new javax.swing.JRadioButton();
        DeliveryCancel = new javax.swing.JRadioButton();
        TimePending = new javax.swing.JRadioButton();
        CurrentTime = new javax.swing.JRadioButton();
        OtherTime = new javax.swing.JRadioButton();
        jtfTime = new javax.swing.JTextField();

        jSelectDelivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSelectDelivery.setText("Please Select Delivery");

        jSelectPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSelectPayment.setText("Payment Type");

        jcbDelivery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbDelivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        jbtUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtUpdate.setText("Update");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        jlbDeliveryStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDeliveryStatus.setText("Delivery Status");

        jlbTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTime.setText("Time Stamp");

        PaymentTypeGroup.add(Pending);
        Pending.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pending.setSelected(true);
        Pending.setText("Pending");

        PaymentTypeGroup.add(CashOnDelivery);
        CashOnDelivery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CashOnDelivery.setText("Cash On Delivery");

        DeliveryStatusGroup.add(Waiting);
        Waiting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Waiting.setSelected(true);
        Waiting.setText("Wait to Delivery");

        DeliveryStatusGroup.add(Delivered);
        Delivered.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delivered.setText("Delivered");

        DeliveryStatusGroup.add(DeliveryCancel);
        DeliveryCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeliveryCancel.setText("Cancel");

        TimeStampGroup.add(TimePending);
        TimePending.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TimePending.setSelected(true);
        TimePending.setText("Pending");

        TimeStampGroup.add(CurrentTime);
        CurrentTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CurrentTime.setText("Current Time");

        TimeStampGroup.add(OtherTime);
        OtherTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherTime.setText("Other");

        jtfTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(CashOnDelivery))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSelectPayment)
                            .addComponent(jSelectDelivery)
                            .addComponent(jlbDeliveryStatus)
                            .addComponent(jlbTime))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jcbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtUpdate)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Waiting)
                                            .addGap(18, 18, 18)
                                            .addComponent(Delivered)
                                            .addGap(18, 18, 18)
                                            .addComponent(DeliveryCancel))
                                        .addComponent(Pending)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TimePending)
                                            .addGap(18, 18, 18)
                                            .addComponent(CurrentTime)
                                            .addGap(18, 18, 18)
                                            .addComponent(OtherTime)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectDelivery)
                    .addComponent(jcbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSelectPayment)
                    .addComponent(Pending)
                    .addComponent(CashOnDelivery))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDeliveryStatus)
                    .addComponent(Waiting)
                    .addComponent(Delivered)
                    .addComponent(DeliveryCancel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTime)
                    .addComponent(TimePending)
                    .addComponent(CurrentTime)
                    .addComponent(OtherTime)
                    .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbtUpdate)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
        
        Pending.setActionCommand("Pending");
        CashOnDelivery.setActionCommand("Cash On Delivery");
        
        Waiting.setActionCommand("Wait to Deliver");
        Delivered.setActionCommand("Delivered");
        DeliveryCancel.setActionCommand("Cancel");
        
        TimePending.setActionCommand("Pending");
        CurrentTime.setActionCommand(now.format(dtf));
        OtherTime.setActionCommand(jtfTime.getText());
        
        if(jcbDelivery.getSelectedIndex() == 0 || (OtherTime.isSelected() && jtfTime.getText().toString().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0; i < orderManagement.getCustDelivery().getNumberOfEntries(); i ++)
            {
                if(jcbDelivery.getSelectedItem().toString().equals(orderManagement.getCustDelivery().getEntry(i).getOrderID().toString()+ " || " +orderManagement.getCustDelivery().getEntry(i).getCustName().toString())){
                    delivery = orderManagement.getCustDelivery().getEntry(i);
                    delivery.setOrderStatus(DeliveryStatusGroup.getSelection().getActionCommand());
                    delivery.setPaymentStatus(PaymentTypeGroup.getSelection().getActionCommand());
                    delivery.setTimestamp(TimeStampGroup.getSelection().getActionCommand());
                    orderManagement.transferDeliveryQueue();
                    orderManagement.writeDeliveryFile();
                    JOptionPane.showMessageDialog(new JFrame(), "Update Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }       
        }
    }//GEN-LAST:event_jbtUpdateActionPerformed


    private void getDelivery(){
        orderManagement.readFile();
        
        while(orderManagement.getDeliveryQueue().isEmpty() != true ){
            delivery = orderManagement.getDeliveryQueue().dequeue();
            
            if(delivery.getPickUpType().toString().equals("Delivery (+ RM 10)")){
                    jcbDelivery.addItem(delivery.getOrderID() + " || " +delivery.getCustName());
            }
        }    
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CashOnDelivery;
    private javax.swing.JRadioButton CurrentTime;
    private javax.swing.JRadioButton Delivered;
    private javax.swing.JRadioButton DeliveryCancel;
    private javax.swing.ButtonGroup DeliveryStatusGroup;
    private javax.swing.JRadioButton OtherTime;
    private javax.swing.ButtonGroup PaymentTypeGroup;
    private javax.swing.JRadioButton Pending;
    private javax.swing.JRadioButton TimePending;
    private javax.swing.ButtonGroup TimeStampGroup;
    private javax.swing.JRadioButton Waiting;
    private javax.swing.JLabel jSelectDelivery;
    private javax.swing.JLabel jSelectPayment;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JComboBox<String> jcbDelivery;
    private javax.swing.JLabel jlbDeliveryStatus;
    private javax.swing.JLabel jlbTime;
    private javax.swing.JTextField jtfTime;
    // End of variables declaration//GEN-END:variables
}
