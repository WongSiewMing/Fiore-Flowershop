package ModuleD;

import ModuleC.Order;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderManagementGUI extends javax.swing.JFrame {

    private Order order = new Order();

    OrderManagement orderManagement = new OrderManagement();

    public OrderManagementGUI() {
        initComponents();
        orderManagement.transferList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFlowerShop = new javax.swing.JLabel();
        jbtCheckOrder = new javax.swing.JButton();
        jbtCheckDelivery = new javax.swing.JButton();
        jlbTitle = new javax.swing.JLabel();
        jbtRecordDelivery = new javax.swing.JButton();
        jbtRecordOrder = new javax.swing.JButton();
        jspOrder = new javax.swing.JScrollPane();
        jtbOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfType = new javax.swing.JTextField();
        jtforderID = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfStatus = new javax.swing.JTextField();
        jtfTime = new javax.swing.JTextField();
        jtfPayment = new javax.swing.JTextField();
        jtfAddress1 = new javax.swing.JTextField();
        jtfAddress2 = new javax.swing.JTextField();
        jtfState = new javax.swing.JTextField();
        jtfPostCode = new javax.swing.JTextField();
        jbtCheck = new javax.swing.JButton();
        jBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFlowerShop.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jlbFlowerShop.setText("FIORE FLOWERSHOP");

        jbtCheckOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtCheckOrder.setText("Check Order");
        jbtCheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckOrderActionPerformed(evt);
            }
        });

        jbtCheckDelivery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtCheckDelivery.setText("Check Delivery");
        jbtCheckDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckDeliveryActionPerformed(evt);
            }
        });

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setText("Order & Delivery Management");

        jbtRecordDelivery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtRecordDelivery.setText("Update Delivery");
        jbtRecordDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecordDeliveryActionPerformed(evt);
            }
        });

        jbtRecordOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtRecordOrder.setText("Update Order");
        jbtRecordOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecordOrderActionPerformed(evt);
            }
        });

        jtbOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspOrder.setViewportView(jtbOrder);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Order ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Customer Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Order Status");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Time Stamp");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Payment Status");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address Line 1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address Line 2");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("State");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Post Code");

        jtfType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtforderID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfAddress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfPostCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtCheck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtCheck.setText("Check");
        jbtCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckActionPerformed(evt);
            }
        });

        jBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jlbFlowerShop))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jlbTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jspOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtCheckDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jbtCheckOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtRecordOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtRecordDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfPostCode)
                            .addComponent(jtfState)
                            .addComponent(jtfAddress2)
                            .addComponent(jtfAddress1)
                            .addComponent(jtfPayment)
                            .addComponent(jtfTime)
                            .addComponent(jtfStatus)
                            .addComponent(jtfName)
                            .addComponent(jtfType)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtforderID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 43, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jtforderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtfPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jspOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtCheckOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jbtRecordOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtCheckDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jbtRecordDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jbtCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed

        orderManagement.transferOrderList();
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
        model.setRowCount(0);
        jtbOrder.setModel(model);

        for (int i = 0; i < orderManagement.getOrdertoday().getNumberOfEntries(); i++) {
            order = orderManagement.getOrdertoday().getEntry(i);
            Object[] row = {order.getOrder_id(), order.getCustomer().getCustName()};
            model.addRow(row);
        }

        jtbOrder.setModel(model);

    }//GEN-LAST:event_jbtCheckOrderActionPerformed

    private void jbtRecordOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordOrderActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new UpdateOrder());
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Update Order");
        frame.setResizable(false);
    }//GEN-LAST:event_jbtRecordOrderActionPerformed

    private void jbtCheckDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckDeliveryActionPerformed

        orderManagement.efficientRoute();
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
        model.setRowCount(0);
        jtbOrder.setModel(model);

        while (!orderManagement.getEfficientRoute().isEmpty()) {
            order = orderManagement.getEfficientRoute().dequeue();
            Object[] row = {order.getOrder_id(), order.getCustomer().getCustName()};
            model.addRow(row);
        }
        jtbOrder.setModel(model);
        if(model.getRowCount()==0){
             JOptionPane.showMessageDialog(null, "No Available Delivery order!", "No Delivery", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jbtCheckDeliveryActionPerformed

    private void jbtRecordDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordDeliveryActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new UpdateDelivery());
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Update Delivery");
        frame.setResizable(false);
    }//GEN-LAST:event_jbtRecordDeliveryActionPerformed

    private void jbtCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
   
       
        int selectedRowIndex = jtbOrder.getSelectedRow();
        String id = model.getValueAt(selectedRowIndex, 0).toString();
         
       
        
        for (int i = 0; i < orderManagement.getOrdertoday().getNumberOfEntries(); i++) {
            if (id.equals(orderManagement.getOrdertoday().getEntry(i).getOrder_id())) {
                order = orderManagement.getOrdertoday().getEntry(i);
                jtforderID.setText(order.getOrder_id());
                jtfName.setText(order.getCustomer().getCustName());
                jtfAddress1.setText(order.getCustomer().getCustAddressLine1());
                jtfAddress2.setText(order.getCustomer().getCustAddressLine2());
                jtfPayment.setText(order.getPaymentStatus());
                jtfPostCode.setText(order.getCustomer().getCustPostCode());
                jtfState.setText(order.getCustomer().getCustState());
                jtfStatus.setText(order.getOrderStatus());
                jtfTime.setText(order.getTimestamp());
                jtfType.setText(order.getCustomer().getType());
            }

        }
        

        for (int i = 0; i < orderManagement.getDeliverytoday().getNumberOfEntries(); i++) {
            if (id.equals(orderManagement.getDeliverytoday().getEntry(i).getOrder_id())) {
                order = orderManagement.getDeliverytoday().getEntry(i);
                jtforderID.setText(order.getOrder_id());
                jtfName.setText(order.getCustomer().getCustName());
                jtfAddress1.setText(order.getCustomer().getCustAddressLine1());
                jtfAddress2.setText(order.getCustomer().getCustAddressLine2());
                jtfPayment.setText(order.getPaymentStatus());
                jtfPostCode.setText(order.getCustomer().getCustPostCode());
                jtfState.setText(order.getCustomer().getCustState());
                jtfStatus.setText(order.getOrderStatus());
                jtfTime.setText(order.getTimestamp());
                jtfType.setText(order.getCustomer().getType());
            }

        }
         
        
    }//GEN-LAST:event_jbtCheckActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
         dispose();
        MainMenu.MainMenu menu = new MainMenu.MainMenu();
        menu.setVisible(true);
        menu.setTitle("Main Menu");
        menu.setResizable(false);
    }//GEN-LAST:event_jBackActionPerformed
  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               OrderManagementGUI ui = new OrderManagementGUI();
               ui.setVisible(true);
               ui.setTitle("Order Management Module");
               ui.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtCheck;
    private javax.swing.JButton jbtCheckDelivery;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtRecordDelivery;
    private javax.swing.JButton jbtRecordOrder;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JScrollPane jspOrder;
    private javax.swing.JTable jtbOrder;
    private javax.swing.JTextField jtfAddress1;
    private javax.swing.JTextField jtfAddress2;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPayment;
    private javax.swing.JTextField jtfPostCode;
    private javax.swing.JTextField jtfState;
    private javax.swing.JTextField jtfStatus;
    private javax.swing.JTextField jtfTime;
    private javax.swing.JTextField jtfType;
    private javax.swing.JTextField jtforderID;
    // End of variables declaration//GEN-END:variables
}
