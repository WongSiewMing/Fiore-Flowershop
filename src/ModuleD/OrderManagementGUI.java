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
    private LinkedQueue<Order> efficientRoute = new LinkedQueue<>();
    private LinkedList<Order> ordertoday = new LinkedList<>();
    private LinkedList<Order> deliverytoday = new LinkedList<>();
    private Order order = new Order();
    private Order orderList = new Order();
    
    public OrderManagementGUI() {
        initComponents();
        transferList();
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
                "Order ID", "Customer Name", "Customer Type", "Order Status", "Time Stamp", "Payment Status", "Address"
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbFlowerShop)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jlbTitle)))
                .addGap(390, 390, 390))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jspOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jbtCheckOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbtRecordOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtCheckDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbtRecordDelivery)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGap(18, 18, 18)
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

        transferList();
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
        model.setRowCount(0);
        jtbOrder.setModel(model);
        
        for(int i = 0; i < ordertoday.getNumberOfEntries() ; i++){
            order = ordertoday.getEntry(i);
            Object[] row = {order.getOrderID(),order.getCustName(),order.getCustType(),order.getOrderStatus(),order.getTimestamp(),order.getPaymentStatus(),(order.getAddressLine1() + order.getAddressLine2() + order.getPostCode() + order.getState())};
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
    public void efficientRoute(){
        transferList();
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            
            if(order.getState().toString().equals("Kuala Lumpur")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Selangor")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Perak")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Negeri Sembilan")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Pahang")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Melaka")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Penang")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Kelantan")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Terengganu")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Johor")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Kedah")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Perlis")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Sabah (+ RM 10)")){
                efficientRoute.enqueue(order);
            }
        }
        
        for(int i = 0; i < deliverytoday.getNumberOfEntries(); i ++){
            order = deliverytoday.getEntry(i);
            if(order.getState().toString().equals("Sarawak (+ RM 10)")){
                efficientRoute.enqueue(order);
            }
        }
    }
    
    public void transferList(){
        
        initializeList();
        ordertoday.clear();
        deliverytoday.clear();
        
        while(!orderqueue.isEmpty()){
            
            order = orderqueue.dequeue();

            if(order.getPickUpType().toString().equals("Self Pick-Up (+ RM 0)")){
                ordertoday.add(order);
            }
            else{
                deliverytoday.add(order);
            }
        }
    }
    
    private void jbtRecordOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordOrderActionPerformed
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(new UpdateOrder());
            frame.pack();
            frame.setVisible(true);
    }//GEN-LAST:event_jbtRecordOrderActionPerformed

    private void jbtCheckDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckDeliveryActionPerformed
        
        efficientRoute();
        DefaultTableModel model = (DefaultTableModel) jtbOrder.getModel();
        model.setRowCount(0);
        jtbOrder.setModel(model);
        
        while(!efficientRoute.isEmpty()){
            order = efficientRoute.dequeue();
            Object[] row = {order.getOrderID(),order.getCustName(),order.getCustType(),order.getOrderStatus(),order.getTimestamp(),order.getPaymentStatus(),(order.getAddressLine1() + order.getAddressLine2() + order.getPostCode() + order.getState())};
            model.addRow(row);
        }
            jtbOrder.setModel(model);

    }//GEN-LAST:event_jbtCheckDeliveryActionPerformed

    private void jbtRecordDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordDeliveryActionPerformed
        JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(new UpdateDelivery());
            frame.pack();
            frame.setVisible(true);
    }//GEN-LAST:event_jbtRecordDeliveryActionPerformed

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
