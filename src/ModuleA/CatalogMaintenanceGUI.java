
package ModuleA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CatalogMaintenanceGUI extends javax.swing.JFrame {
    private ListArray<Product> flowerList = new ListArray<>(25);
    private Product product = new Product();
    /**
     * Creates new form CatalogMaintenanceGUI
     */
    public CatalogMaintenanceGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFlowerShop = new javax.swing.JLabel();
        jbtAddProd = new javax.swing.JButton();
        jbtUpdateProd = new javax.swing.JButton();
        jbtAddPromotion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();
        jbtUpdatePromotion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jbSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFlowerShop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbFlowerShop.setText("FIORE FLOWERSHOP");

        jbtAddProd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtAddProd.setText("Add New Product");
        jbtAddProd.setToolTipText("");
        jbtAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddProdActionPerformed(evt);
            }
        });

        jbtUpdateProd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtUpdateProd.setText("Update Product Details");
        jbtUpdateProd.setMaximumSize(new java.awt.Dimension(215, 37));
        jbtUpdateProd.setMinimumSize(new java.awt.Dimension(215, 37));
        jbtUpdateProd.setPreferredSize(new java.awt.Dimension(215, 37));
        jbtUpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateProdActionPerformed(evt);
            }
        });

        jbtAddPromotion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtAddPromotion.setText("Create Promotion");
        jbtAddPromotion.setMaximumSize(new java.awt.Dimension(215, 37));
        jbtAddPromotion.setMinimumSize(new java.awt.Dimension(215, 37));
        jbtAddPromotion.setPreferredSize(new java.awt.Dimension(215, 37));
        jbtAddPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddPromotionActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableList.setAutoCreateRowSorter(true);
        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description", "Product Type", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableList.setToolTipText("");
        jTableList.setColumnSelectionAllowed(true);
        jTableList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableList);
        jTableList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jbtUpdatePromotion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtUpdatePromotion.setText("Update Promotion");
        jbtUpdatePromotion.setMaximumSize(new java.awt.Dimension(215, 37));
        jbtUpdatePromotion.setMinimumSize(new java.awt.Dimension(215, 37));
        jbtUpdatePromotion.setPreferredSize(new java.awt.Dimension(215, 37));
        jbtUpdatePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdatePromotionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Welcome to Catalog Maintenance Menu!");
        jLabel1.setToolTipText("");

        jLabel3.setText("Search by Catalog :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresh Flower", "Bouquet", "Floral Arrangement" }));

        jbSearch.setText("Search / Refreash");
        jbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtUpdatePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtAddPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbFlowerShop)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbFlowerShop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbtUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtAddPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbtUpdatePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddProdActionPerformed
        AddProductGUI add = new AddProductGUI();
        add.setLocationRelativeTo(null);
        add.setVisible(true);
        
    }//GEN-LAST:event_jbtAddProdActionPerformed

    private void jbtUpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtUpdateProdActionPerformed

    private void jbtUpdatePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdatePromotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtUpdatePromotionActionPerformed

    private void jbtAddPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddPromotionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtAddPromotionActionPerformed

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchActionPerformed
        clearTable();
        displayTable();
    }//GEN-LAST:event_jbSearchActionPerformed

    private void displayTable(){
        initializeList();
        DefaultTableModel model = (DefaultTableModel) jTableList.getModel();
            for (int i=0; i<flowerList.getLength();i++){
                product = flowerList.get(i);
                Object[] row = {product.getProd_id(), product.getProd_name(), product.getProd_desc(), product.getProd_type(), product.getPrice(), product.getQuantity()};
                model.addRow(row);
            }
            jTableList.setModel(model);
    }
    
    private void clearTable(){
        DefaultTableModel model = (DefaultTableModel) jTableList.getModel();
        model.setRowCount(0);
    }
    
    private void initializeList() {
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("flower.dat"));
            flowerList = (ListArray)oiStream.readObject();
            oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatalogMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogMaintenanceGUI().setVisible(true);
                new CatalogMaintenanceGUI().setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableList;
    private javax.swing.JButton jbSearch;
    private javax.swing.JButton jbtAddProd;
    private javax.swing.JButton jbtAddPromotion;
    private javax.swing.JButton jbtUpdateProd;
    private javax.swing.JButton jbtUpdatePromotion;
    private javax.swing.JLabel jlbFlowerShop;
    // End of variables declaration//GEN-END:variables
}
