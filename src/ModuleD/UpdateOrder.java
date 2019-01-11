package ModuleD;

import ModuleC.Order;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class UpdateOrder extends javax.swing.JPanel {

    private Order order = new Order();

    LocalTime now = LocalTime.now(); 
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

    OrderManagement orderManagement = new OrderManagement();
    
    public UpdateOrder() {
        initComponents();
        getOrder();  
        orderManagement.transferOrderList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentTypeGroup = new javax.swing.ButtonGroup();
        OrderStatusGroup = new javax.swing.ButtonGroup();
        TimeStampGroup = new javax.swing.ButtonGroup();
        jlSelectOrder = new javax.swing.JLabel();
        jlPaymentType = new javax.swing.JLabel();
        jcbOrder = new javax.swing.JComboBox<>();
        jbtUpdate = new javax.swing.JButton();
        Pending = new javax.swing.JRadioButton();
        Cash = new javax.swing.JRadioButton();
        CreditCard = new javax.swing.JRadioButton();
        jlbOrderStatus = new javax.swing.JLabel();
        Waiting = new javax.swing.JRadioButton();
        PickedUp = new javax.swing.JRadioButton();
        OrderCancel = new javax.swing.JRadioButton();
        jlbTime = new javax.swing.JLabel();
        TimePending = new javax.swing.JRadioButton();
        CurrentTime = new javax.swing.JRadioButton();
        jtfTime = new javax.swing.JTextField();
        OtherTime = new javax.swing.JRadioButton();

        jlSelectOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSelectOrder.setText("Please Select Order ");

        jlPaymentType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPaymentType.setText("Payment Type");

        jcbOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -" }));

        jbtUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtUpdate.setText("Update");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        PaymentTypeGroup.add(Pending);
        Pending.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pending.setSelected(true);
        Pending.setText("Pending");

        PaymentTypeGroup.add(Cash);
        Cash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cash.setText("Cash");

        PaymentTypeGroup.add(CreditCard);
        CreditCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CreditCard.setText("Credit Card");

        jlbOrderStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbOrderStatus.setText("Order Status");

        OrderStatusGroup.add(Waiting);
        Waiting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Waiting.setSelected(true);
        Waiting.setText("Wait to Pick Up");

        OrderStatusGroup.add(PickedUp);
        PickedUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PickedUp.setText("Picked Up");

        OrderStatusGroup.add(OrderCancel);
        OrderCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OrderCancel.setText("Cancel");

        jlbTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTime.setText("Time Stamp");

        TimeStampGroup.add(TimePending);
        TimePending.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TimePending.setSelected(true);
        TimePending.setText("Pending");

        TimeStampGroup.add(CurrentTime);
        CurrentTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CurrentTime.setText("Current Time");

        jtfTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TimeStampGroup.add(OtherTime);
        OtherTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherTime.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTime)
                    .addComponent(jlbOrderStatus)
                    .addComponent(jlPaymentType)
                    .addComponent(jlSelectOrder))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Pending)
                                .addGap(18, 18, 18)
                                .addComponent(Cash)
                                .addGap(18, 18, 18)
                                .addComponent(CreditCard)))
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Waiting)
                                .addGap(18, 18, 18)
                                .addComponent(PickedUp)
                                .addGap(18, 18, 18)
                                .addComponent(OrderCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtUpdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TimePending)
                                        .addGap(18, 18, 18)
                                        .addComponent(CurrentTime)
                                        .addGap(18, 18, 18)
                                        .addComponent(OtherTime)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelectOrder)
                    .addComponent(jcbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPaymentType)
                    .addComponent(Pending)
                    .addComponent(Cash)
                    .addComponent(CreditCard))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbOrderStatus)
                    .addComponent(Waiting)
                    .addComponent(PickedUp)
                    .addComponent(OrderCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTime)
                    .addComponent(TimePending)
                    .addComponent(CurrentTime)
                    .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OtherTime))
                .addGap(18, 18, 18)
                .addComponent(jbtUpdate)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
        
        Pending.setActionCommand("Pending");
        CreditCard.setActionCommand("Credit Card");
        Cash.setActionCommand("Cash");
        
        Waiting.setActionCommand("Wait to Pick Up");
        PickedUp.setActionCommand("Picked Up");
        OrderCancel.setActionCommand("Cancel");
        
        TimePending.setActionCommand("Pending");
        CurrentTime.setActionCommand(now.format(dtf));
        OtherTime.setActionCommand(jtfTime.getText());
        
        if(jcbOrder.getSelectedIndex() == 0 || (OtherTime.isSelected() && jtfTime.getText().toString().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0; i < orderManagement.getCustorder().getNumberOfEntries(); i ++)
            {
                if(jcbOrder.getSelectedItem().toString().equals(orderManagement.getCustorder().getEntry(i).getOrder_id()+ " || " +orderManagement.getCustorder().getEntry(i).getCustomer().getCustName())){
                    order = orderManagement.getCustorder().getEntry(i);
                    order.setOrderStatus(OrderStatusGroup.getSelection().getActionCommand());
                    order.setPaymentStatus(PaymentTypeGroup.getSelection().getActionCommand());
                    order.setTimestamp(TimeStampGroup.getSelection().getActionCommand());
                    orderManagement.transferOrderQueue();
                    orderManagement.writeOrderFile();
                    JOptionPane.showMessageDialog(new JFrame(), "Update Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }        
        }
    }//GEN-LAST:event_jbtUpdateActionPerformed

    public void getOrder(){
        orderManagement.readFile();
        
        while(orderManagement.getOrderqueue().isEmpty() != true ){
            order = orderManagement.getOrderqueue().dequeue();
            if(order.getPickUpType().equals("Self Pick-Up (+ RM 0)") || order.getPickUpType().toString().equals("Self Pick Up")){
                jcbOrder.addItem(order.getOrder_id() + " || " +order.getCustomer().getCustName());
            }
        }
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cash;
    private javax.swing.JRadioButton CreditCard;
    private javax.swing.JRadioButton CurrentTime;
    private javax.swing.JRadioButton OrderCancel;
    private javax.swing.ButtonGroup OrderStatusGroup;
    private javax.swing.JRadioButton OtherTime;
    private javax.swing.ButtonGroup PaymentTypeGroup;
    private javax.swing.JRadioButton Pending;
    private javax.swing.JRadioButton PickedUp;
    private javax.swing.JRadioButton TimePending;
    private javax.swing.ButtonGroup TimeStampGroup;
    private javax.swing.JRadioButton Waiting;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JComboBox<String> jcbOrder;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlSelectOrder;
    private javax.swing.JLabel jlbOrderStatus;
    private javax.swing.JLabel jlbTime;
    private javax.swing.JTextField jtfTime;
    // End of variables declaration//GEN-END:variables
}

