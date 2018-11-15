package ModuleD;

import ModuleE.Order;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class OrderManagementGUI extends javax.swing.JFrame {

    List<Order> order = new ArrayList<>();
    Object[][] data = {
           {"James","Normal","Wait to Pick Up","Pending","Pending"},
           {"Mary","Normal","Picked Up","10.00 am","COD"}
       };
    
    public OrderManagementGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFlowerShop = new javax.swing.JLabel();
        jbtCheckOrder = new javax.swing.JButton();
        jbtCheckDelivery = new javax.swing.JButton();
        jlbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbOrderList = new javax.swing.JTable();
        jbtRecordDelivery = new javax.swing.JButton();
        jbtRecordOrder = new javax.swing.JButton();

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

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setText("Order & Delivery Management");

        jtbOrderList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Customer Type", "Order Status", "Time Stamp", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbOrderList);

        jbtRecordDelivery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtRecordDelivery.setText("Record Delivery");

        jbtRecordOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtRecordOrder.setText("Record Order");
        jbtRecordOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecordOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jlbFlowerShop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jlbTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbtCheckOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbtRecordOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtCheckDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbtRecordDelivery)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCheckOrder)
                    .addComponent(jbtRecordDelivery)
                    .addComponent(jbtCheckDelivery)
                    .addComponent(jbtRecordOrder))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
        jtbOrderList.setValueAt("James", 0, 0);
        jtbOrderList.setValueAt("Normal", 0, 1);
        jtbOrderList.setValueAt("Wait to Pick Up", 0, 2);
        jtbOrderList.setValueAt("Pending", 0, 3);
        jtbOrderList.setValueAt("Pending", 0, 4);
        
        jtbOrderList.setValueAt("Mary", 1, 0);
        jtbOrderList.setValueAt("Normal", 1, 1);
        jtbOrderList.setValueAt("Picked Up", 1, 2);
        jtbOrderList.setValueAt("10.00 am", 1, 3);
        jtbOrderList.setValueAt("COD", 1, 4);
    }//GEN-LAST:event_jbtCheckOrderActionPerformed

    private void jbtRecordOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordOrderActionPerformed
       
    }//GEN-LAST:event_jbtRecordOrderActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCheckDelivery;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtRecordDelivery;
    private javax.swing.JButton jbtRecordOrder;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTable jtbOrderList;
    // End of variables declaration//GEN-END:variables
}
