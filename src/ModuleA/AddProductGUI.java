
package ModuleA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AddProductGUI extends javax.swing.JFrame {
    private CircularLinkedList<Product> flowerList = new CircularLinkedList<Product>();
    private Product product = new Product();

    /**
     * Creates new form AddProductGUI
     */
    public AddProductGUI() {
        initComponents();
        initializeList();
        jtfProd_id.setText(generateId());
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
        jLabel1 = new javax.swing.JLabel();
        jtfProd_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfProd_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfProd_desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jcbProd_type = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtfQuantity = new javax.swing.JTextField();
        jbtAdd = new javax.swing.JButton();
        jbtReset = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jCheckPromotion = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jStartDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jEndDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDiscountPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFlowerShop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbFlowerShop.setText("ADD NEW PRODUCT");

        jLabel1.setText("PRODUCT ID : ");

        jtfProd_id.setEditable(false);
        jtfProd_id.setToolTipText("");

        jLabel2.setText("PRODUCT NAME : ");

        jLabel3.setText("PRODUCT DESCRIPTION : ");

        jLabel4.setText("PRODUCT TYPE : ");

        jtfProd_desc.setColumns(20);
        jtfProd_desc.setRows(5);
        jScrollPane1.setViewportView(jtfProd_desc);

        jLabel5.setText("PRODUCT PRICE (RM) : ");

        jtfPrice.setText("0.0");

        jcbProd_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresh Flowers", "Bouquets", "Floral Arrangements" }));

        jLabel6.setText("PRODUCT QUANTITY : ");

        jtfQuantity.setText("0");

        jbtAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtAdd.setText("Add");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jbtReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtReset.setText("Reset");
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        jbtBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBack.setText("Back");
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });

        jCheckPromotion.setText("Include Promotion");
        jCheckPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPromotionActionPerformed(evt);
            }
        });

        jLabel7.setText("START PROMOTION DATE : ");

        jStartDate.setEnabled(false);

        jLabel8.setText("END PROMOTION DATE : ");

        jEndDate.setEnabled(false);

        jLabel9.setText("DISCOUNT PRICE : ");

        jDiscountPrice.setText("0.0");
        jDiscountPrice.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jCheckPromotion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbProd_type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfProd_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfProd_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStartDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEndDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDiscountPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbFlowerShop)
                        .addGap(24, 24, 24)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbFlowerShop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfProd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfProd_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbProd_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckPromotion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jDiscountPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        
        Product tmp = new Product();
        try{
            
            tmp.setProd_id(jtfProd_id.getText());
            tmp.setProd_name(jtfProd_name.getText());
            tmp.setProd_desc(jtfProd_desc.getText());
            Object ob = jcbProd_type.getSelectedItem();
            tmp.setProd_type(ob.toString());
            tmp.setPrice(Double.parseDouble(jtfPrice.getText()));
            tmp.setQuantity(Integer.parseInt(jtfQuantity.getText()));
            if (jCheckPromotion.isSelected()){
                Promotion promotion = new Promotion(jStartDate.getCalendar().getTime(), jEndDate.getCalendar().getTime(), Double.parseDouble(jDiscountPrice.getText()));
                tmp.setPromotion(promotion);
            }
            else{
                Promotion promotion = new Promotion();
                tmp.setPromotion(promotion);
            }
            flowerList.add(tmp);
            saveList();
            JOptionPane.showMessageDialog(new JFrame(), "Product Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearData();
            jtfProd_id.setText(generateId());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Please fill all the blank space!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtAddActionPerformed

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        clearData();
    }//GEN-LAST:event_jbtResetActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jCheckPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPromotionActionPerformed
        if (jCheckPromotion.isSelected()){
            jStartDate.setEnabled(true);
            jEndDate.setEnabled(true);
            jDiscountPrice.setEnabled(true);
        }
        else {
            jStartDate.setEnabled(false);
            jEndDate.setEnabled(false);
            jDiscountPrice.setEnabled(false);
        }
        
    }//GEN-LAST:event_jCheckPromotionActionPerformed

    
    private void initializeList() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("flower.dat"));
            ArrayList<Product> tmp = new ArrayList<Product>();
            tmp = (ArrayList)oiStream.readObject();
            for(int i=0; i<tmp.size(); i++){
                product = tmp.get(i);
                flowerList.add(product);
            }
            oiStream.close();
            
        } catch (FileNotFoundException ex) {
            if (JOptionPane.showConfirmDialog(null, "File not found, would you like to create a new file ?", "ERROR", JOptionPane.ERROR_MESSAGE)==0){
                saveList();
            }
            else {
                JOptionPane.showMessageDialog(null, "Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
      }
    
    private void saveList(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("flower.dat"));
            ArrayList tmp = new ArrayList();
            for(int i=0; i<flowerList.size();i++){
                product = flowerList.getEntry(i);
                tmp.add(product);
                
            }
            ooStream.writeObject(tmp);
            ooStream.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String generateId(){
        String id = null;
        id = Integer.toString(flowerList.size() + 1);
        
        if (flowerList.size()>0){
            if (id.length() < 5 && id.length() > 0){
                if (id.length() > 1){
                    if (id.length() > 2){
                        id = "FL" + id;
                    }
                    else{
                        id = "FL0" + id;
                    }
                }
                else {
                    id = "FL00" + id;
                }
            }
            else{
                id = "FL001" + id;
            }
        }
        else {
            id = "FL001";
        }
        return id;
    }
    
    private void clearData(){
        jtfProd_name.setText("");
        jtfProd_desc.setText("");
        jcbProd_type.setSelectedIndex(0);
        jtfPrice.setText("0.0");
        jtfQuantity.setText("0");
        jCheckPromotion.setSelected(false);
        jStartDate.setEnabled(false);
        jStartDate.setDate(null);
        jEndDate.setEnabled(false);
        jEndDate.setDate(null);
        jDiscountPrice.setEnabled(false);
        jDiscountPrice.setText("0.0");
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
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckPromotion;
    private javax.swing.JTextField jDiscountPrice;
    private com.toedter.calendar.JDateChooser jEndDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jStartDate;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtReset;
    private javax.swing.JComboBox<String> jcbProd_type;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextArea jtfProd_desc;
    private javax.swing.JTextField jtfProd_id;
    private javax.swing.JTextField jtfProd_name;
    private javax.swing.JTextField jtfQuantity;
    // End of variables declaration//GEN-END:variables
}
