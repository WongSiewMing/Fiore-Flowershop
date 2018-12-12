package ModuleD;

import ModuleE.Order;
import ModuleE.LinkedQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderManagementGUI extends javax.swing.JFrame {
    
    private LinkedQueue<Order> orderqueue = new LinkedQueue<>();
    private LinkedList<Order> ordertoday = new LinkedList<>();
    private Order order = new Order();
    private Order orderList = new Order();
    
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
        jbtRecordDelivery = new javax.swing.JButton();
        jbtRecordOrder = new javax.swing.JButton();
        jspOrder = new javax.swing.JScrollPane();
        jtbOrder = new javax.swing.JTable();

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

        jbtRecordDelivery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtRecordDelivery.setText("Update Delivery");

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
                "Order ID", "Customer Name", "Customer Type", "Order Status", "Time Stamp", "Payment Status", "Delivery Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspOrder.setViewportView(jtbOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbFlowerShop)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jlbTitle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jspOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jbtCheckOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbtRecordOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtCheckDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbtRecordDelivery)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGap(13, 13, 13)
                .addComponent(jspOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCheckOrder)
                    .addComponent(jbtRecordDelivery)
                    .addComponent(jbtCheckDelivery)
                    .addComponent(jbtRecordOrder))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed
       
        initializeList();
        
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
        model.setRowCount(0);
        jtbOrder.setModel(model);
        
        while(orderqueue.isEmpty() != true ){
                order = orderqueue.dequeue();
                Object[] row = {order.getOrderID(),order.getCustName(),order.getCustType(),order.getOrderStatus(),order.getTimestamp(),order.getPaymentStatus()};
                model.addRow(row);
            }
            jtbOrder.setModel(model);

    }//GEN-LAST:event_jbtCheckOrderActionPerformed
    
    private void initializeList() {
     
        try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));

        ArrayList<Order> tmp = new ArrayList<Order>();
        tmp = (ArrayList)in.readObject();
        
        for(int i=0; i<tmp.size(); i++)
            {
                orderList = tmp.get(i);
                orderqueue.enqueue(orderList);
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
    
    private void jbtRecordOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordOrderActionPerformed
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(new UpdateOrder());
            frame.pack();
            frame.setVisible(true);
    }//GEN-LAST:event_jbtRecordOrderActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCheckDelivery;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtRecordDelivery;
    private javax.swing.JButton jbtRecordOrder;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JScrollPane jspOrder;
    private javax.swing.JTable jtbOrder;
    // End of variables declaration//GEN-END:variables
}
