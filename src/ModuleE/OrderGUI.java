package ModuleE;

import ModuleA.Product;
import ModuleB.Customer;
import ModuleC.Order;
import ModuleC.SinglyLinkedList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OrderGUI extends javax.swing.JFrame {

    Date date = new Date();
    Date extdate = addDays(date, 0);

    BillInterface bill = new Bill();
    private SinglyLinkedList<Customer> custList = new SinglyLinkedList<Customer>();

    private LinkedQueue<Order> tmpqueue = new LinkedQueue<>();
    private LinkedQueue<Order> orderqueue = new LinkedQueue<>();

    private LinkedQueue<Order> expressorder = new LinkedQueue<>();
    private LinkedQueue<Order> normalorder = new LinkedQueue<>();
    private LinkedQueue<Order> flexiorder = new LinkedQueue<>();

    private Order order = new Order();
    private Customer customer = new Customer();

    public OrderGUI() {
        initComponents();
        readFile();
        jOrderId.setText(generateId(getID()));
        orderqueue.clear();
        displayData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFlowerShop = new javax.swing.JLabel();
        jlbTitle = new javax.swing.JLabel();
        jlbStyle = new javax.swing.JLabel();
        jlbSize = new javax.swing.JLabel();
        jlbFlower = new javax.swing.JLabel();
        jlbAccessories = new javax.swing.JLabel();
        jlbPriority = new javax.swing.JLabel();
        jcbStyle = new javax.swing.JComboBox<>();
        jcbSize = new javax.swing.JComboBox<>();
        jcbFlower = new javax.swing.JComboBox<>();
        jcbAccessories = new javax.swing.JComboBox<>();
        jcbPriority = new javax.swing.JComboBox<>();
        jbtOrder = new javax.swing.JButton();
        jbtCheckOrder = new javax.swing.JButton();
        jlbpickUp = new javax.swing.JLabel();
        jcbPickUp = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jOrderId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCustID = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCustName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCustType = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCreditLimit = new javax.swing.JTextField();
        jBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFlowerShop.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jlbFlowerShop.setText("FIORE FLOWERSHOP");

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setText("Customized Floral Arrangements");

        jlbStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbStyle.setText("Step 1 : Please Select Your Flower Arrangement Style");

        jlbSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbSize.setText("Step 2 : Please Select Your Flower Arrangement Size");

        jlbFlower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbFlower.setText("Step 3 : Please Select Your Flowers");

        jlbAccessories.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbAccessories.setText("Step 4 : Please Select Your Accessories");

        jlbPriority.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbPriority.setText("Final Step : Please Select Your Pick-Up Priority");

        jcbStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Elliptical  (+ RM 10)", "Vertical (+ RM 10)", "Horizontal (+ RM 10)", "Triangular  (+ RM 20)", "‘S’ shaped (+ RM 20)", "Oval shaped (+ RM 30)", "Cascade  (+ RM 30)" }));

        jcbSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Small  (+ RM 10)", "Medium  (+ RM 20)", "Large (+ RM 30)" }));

        jcbFlower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Hybrid Tea (+ RM 30)", "Pernetiana  (+ RM 30)", "Polyantha  (+ RM 30)", "Floribunda  (+ RM 30)", "Grandiflora (+ RM 40)", "Miniature (+ RM 40)", "Climbing and Rambling (+ RM 40)", "Shrub Roses (+ RM 50)", "English/David Austin (+ RM 50)", "Canadian Hardy (+ RM 60)", "Landscape (+ RM 70)", "Patio Roses (+ RM 70)" }));

        jcbAccessories.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAccessories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Bear (+ RM 20)", "Tiger (+ RM 40)", "Diamond (+ RM 60)", "Jewel (+ RM 80)", "Money (+ RM 100)" }));

        jcbPriority.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Express (Within 3 days)  (+ RM 50)", "Normal (Within 7 days) (+ RM 30)", "Flexi  (Within 10 days) (+ RM 10)" }));

        jbtOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtOrder.setText("Place Order");
        jbtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOrderActionPerformed(evt);
            }
        });

        jbtCheckOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtCheckOrder.setText("Check Bill");
        jbtCheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCheckOrderActionPerformed(evt);
            }
        });

        jlbpickUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbpickUp.setText("PICK-UP SELECTION : ");

        jcbPickUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPickUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Please Select -", "Self Pick-Up (+ RM 0)", "Delivery (+ RM 10)" }));

        jLabel7.setText("ORDER ID : ");

        jOrderId.setEditable(false);
        jOrderId.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel2.setText("CUSTOMER ID : ");

        jCustID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCustIDItemStateChanged(evt);
            }
        });

        jLabel5.setText("CUSTOMER NAME : ");

        jCustName.setEditable(false);

        jLabel6.setText("CUSTOMER TYPE : ");

        jCustType.setEditable(false);

        jLabel8.setText("CUSTOMER CREDIT LIMIT : ");

        jCreditLimit.setEditable(false);

        jBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbFlowerShop)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jlbTitle)))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jlbpickUp)
                            .addComponent(jlbStyle)
                            .addComponent(jlbSize)
                            .addComponent(jlbFlower)
                            .addComponent(jlbAccessories)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtCheckOrder))
                                .addComponent(jlbPriority)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCustType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFlowerShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCustType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbpickUp)
                    .addComponent(jcbPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbStyle)
                    .addComponent(jcbStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSize)
                    .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFlower)
                    .addComponent(jcbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAccessories)
                    .addComponent(jcbAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPriority)
                    .addComponent(jcbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOrder)
                    .addComponent(jbtCheckOrder)
                    .addComponent(jBack))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOrderActionPerformed
        readFile();

        Order tmp = new Order();

        while (!orderqueue.isEmpty()) {
            order = orderqueue.dequeue();

            if (order.getPriority().equals("Express (Within 3 days)  (+ RM 50)")) {
                expressorder.enqueue(order);
            }

            if (order.getPriority().equals("Normal (Within 7 days) (+ RM 30)")) {
                normalorder.enqueue(order);
            }

            if (order.getPriority().equals("Flexi  (Within 10 days) (+ RM 10)")) {
                flexiorder.enqueue(order);
            }
        }

        if (jcbPickUp.getSelectedIndex() == 0 || jcbStyle.getSelectedIndex() == 0 || jcbSize.getSelectedIndex() == 0 || jcbFlower.getSelectedIndex() == 0 || jcbAccessories.getSelectedIndex() == 0 || jcbPriority.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter all required data !", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            tmp.setOrder_id(jOrderId.getText());
            for (int i = 0; i < custList.getNumberOfEntries(); i++) {
                if (i == jCustID.getSelectedIndex()) {
                    customer = custList.getEntry(i);
                    tmp.setCustomer(customer);
                }
            }
            tmp.setCustomer(customer);
            tmp.setPickUpType(jcbPickUp.getSelectedItem().toString());
            tmp.setArrangeStyle(jcbStyle.getSelectedItem().toString());
            tmp.setArrangeSize(jcbSize.getSelectedItem().toString());
            tmp.setFlower(jcbFlower.getSelectedItem().toString());
            tmp.setAccessories(jcbAccessories.getSelectedItem().toString());
            tmp.setTimestamp("Pending");
            tmp.setPaymentStatus("Pending");
            tmp.setOrderStatus("Waiting");
            tmp.setPriority(jcbPriority.getSelectedItem().toString());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            if (jcbPriority.getSelectedIndex() == 1) {
                extdate = addDays(date, 3);
                String orderDate = dateFormat.format(extdate);
                tmp.setDate(orderDate);
                expressorder.enqueue(tmp);
            } else if (jcbPriority.getSelectedIndex() == 2) {
                extdate = addDays(date, 7);
                String orderDate = dateFormat.format(extdate);
                tmp.setDate(orderDate);
                normalorder.enqueue(tmp);
            } else if (jcbPriority.getSelectedIndex() == 3) {
                extdate = addDays(date, 10);
                String orderDate = dateFormat.format(extdate);
                tmp.setDate(orderDate);
                flexiorder.enqueue(tmp);
            }

            if (!expressorder.isEmpty()) {
                while (!expressorder.isEmpty()) {
                    order = expressorder.dequeue();
                    orderqueue.enqueue(order);
                }
            }

            if (!normalorder.isEmpty()) {
                while (!normalorder.isEmpty()) {
                    order = normalorder.dequeue();
                    orderqueue.enqueue(order);
                }
            }

            if (!flexiorder.isEmpty()) {
                while (!flexiorder.isEmpty()) {
                    order = flexiorder.dequeue();
                    orderqueue.enqueue(order);
                }
            }
            bill.setOrder_id(jOrderId.getText());
            writeFile();
            JOptionPane.showMessageDialog(new JFrame(), "Order Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearData();
            readFile();
            jOrderId.setText(generateId(getID()));
            orderqueue.clear();
        }

    }//GEN-LAST:event_jbtOrderActionPerformed

    private void jbtCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCheckOrderActionPerformed

        if (bill.getOrder_id() == null) {
            JOptionPane.showMessageDialog(null, "You haven't place any order yet !", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (jcbPriority.getSelectedIndex() == 1) {
                extdate = addDays(date, 3);
                bill.setPriorityPrice(50);
            } else if (jcbPriority.getSelectedIndex() == 2) {
                extdate = addDays(date, 7);
                bill.setPriorityPrice(30);
            } else if (jcbPriority.getSelectedIndex() == 3) {
                extdate = addDays(date, 10);
                bill.setPriorityPrice(10);
            }

            if (jcbPickUp.getSelectedIndex() == 2) {
                bill.setPickUpPrice(10);
            } else {
                bill.setPickUpPrice(0);
            }

            for (int i = 0; i < custList.getNumberOfEntries(); i++) {
                if (i == jCustID.getSelectedIndex()) {
                    customer = custList.getEntry(i);
                }
            }

            if (customer.getCustState().equalsIgnoreCase("Sabah") || customer.getCustState().equalsIgnoreCase("Sarawak")) {
                bill.setStatePrice(10);
            } else {
                bill.setStatePrice(0);
            }

            if (jcbStyle.getSelectedIndex() == 1 || jcbStyle.getSelectedIndex() == 2 || jcbStyle.getSelectedIndex() == 3) {
                bill.setStylePrice(10);
            } else if (jcbStyle.getSelectedIndex() == 4 || jcbStyle.getSelectedIndex() == 5) {
                bill.setStylePrice(20);
            } else {
                bill.setStylePrice(30);
            }

            if (jcbSize.getSelectedIndex() == 1) {
                bill.setSizePrice(10);
            } else if (jcbSize.getSelectedIndex() == 2) {
                bill.setSizePrice(20);
            } else {
                bill.setSizePrice(30);
            }

            if (jcbFlower.getSelectedIndex() == 1 || jcbFlower.getSelectedIndex() == 2 || jcbFlower.getSelectedIndex() == 3 || jcbFlower.getSelectedIndex() == 4) {
                bill.setFlowerPrice(30);
            } else if (jcbFlower.getSelectedIndex() == 5 || jcbFlower.getSelectedIndex() == 6 || jcbFlower.getSelectedIndex() == 7) {
                bill.setFlowerPrice(40);
            } else if (jcbFlower.getSelectedIndex() == 8 || jcbFlower.getSelectedIndex() == 9) {
                bill.setFlowerPrice(50);
            } else if (jcbFlower.getSelectedIndex() == 10) {
                bill.setFlowerPrice(60);
            } else if (jcbFlower.getSelectedIndex() == 11 || jcbFlower.getSelectedIndex() == 12) {
                bill.setFlowerPrice(70);
            }

            if (jcbAccessories.getSelectedIndex() == 1) {
                bill.setAccessoriesPrice(20);
            } else if (jcbAccessories.getSelectedIndex() == 2) {
                bill.setAccessoriesPrice(40);
            } else if (jcbAccessories.getSelectedIndex() == 3) {
                bill.setAccessoriesPrice(60);
            } else if (jcbAccessories.getSelectedIndex() == 4) {
                bill.setAccessoriesPrice(80);
            } else {
                bill.setAccessoriesPrice(100);
            }

            JOptionPane.showMessageDialog(null, bill.billList());
        }
    }//GEN-LAST:event_jbtCheckOrderActionPerformed

    private void jCustIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCustIDItemStateChanged
        int tmpID = jCustID.getSelectedIndex();
        for (int i = 0; i < custList.getNumberOfEntries(); i++) {
            if (tmpID == i) {
                customer = custList.getEntry(i);
                jCustName.setText(customer.getCustName());
                jCustType.setText(customer.getType());
                jCreditLimit.setText(Double.toString(customer.getLimit()));
            }
        }
    }//GEN-LAST:event_jCustIDItemStateChanged

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
           dispose();
        MainMenu.MainMenu menu = new MainMenu.MainMenu();
        menu.setVisible(true);
        menu.setTitle("Main Menu");
        menu.setResizable(false);
                                 
    }//GEN-LAST:event_jBackActionPerformed

    private void readFile() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("orders.dat"));
            ArrayList<Order> tmp = new ArrayList<Order>();
            tmp = (ArrayList) in.readObject();

            for (int i = 0; i < tmp.size(); i++) {
                order = tmp.get(i);
                orderqueue.enqueue(order);
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

    private void writeFile() {
        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orders.dat"));
            ArrayList tmp = new ArrayList();

            while (!orderqueue.isEmpty()) {
                order = orderqueue.dequeue();
                tmp.add(order);
            }

            out.writeObject(tmp);
            out.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Date addDays(Date date, int i) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, i);

        return cal.getTime();
    }

    public int getID() {

        int num = 0;
        while (!orderqueue.isEmpty()) {
            order = orderqueue.dequeue();
            tmpqueue.enqueue(order);
            num++;
        }

        while (!tmpqueue.isEmpty()) {
            order = tmpqueue.dequeue();
            orderqueue.enqueue(order);
        }

        return num;
    }

    public String generateId(int num) {
        String id = null;
        id = Integer.toString(num + 1);

        if (id.length() < 5 && id.length() > 0) {
            if (id.length() > 1) {
                if (id.length() > 2) {
                    id = "OL" + id;
                } else {
                    id = "OL0" + id;
                }
            } else {
                id = "OL00" + id;
            }
        } else {
            id = "OL001";
        }

        return id;
    }

    private void displayData() {
        try {
            if (custList.getNumberOfEntries() == 0) {
                ObjectInputStream oiStream2 = new ObjectInputStream(new FileInputStream("customer.dat"));

                ArrayList tmpcust = new ArrayList();

                tmpcust = (ArrayList) oiStream2.readObject();

                oiStream2.close();

                for (int k = 0; k < tmpcust.size(); k++) {
                    customer = (Customer) tmpcust.get(k);
                    custList.add(customer);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Failed to read file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        for (int j = 0; j < custList.getNumberOfEntries(); j++) {
            customer = custList.getEntry(j);
            jCustID.addItem(customer.getCustId() + " | " + customer.getCustName());
        }
        customer = custList.getEntry(0);
        jCustName.setText(customer.getCustName());
        jCustType.setText(customer.getType());
        jCreditLimit.setText(Double.toString(customer.getLimit()));

    }

    private void clearData() {
        jCustID.setSelectedIndex(0);
        jcbAccessories.setSelectedIndex(0);
        jcbFlower.setSelectedIndex(0);
        jcbPickUp.setSelectedIndex(0);
        jcbPriority.setSelectedIndex(0);
        jcbSize.setSelectedIndex(0);
        jcbStyle.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               OrderGUI ui =  new OrderGUI();
               ui.setVisible(true);
               ui.setTitle("Customized Flower Arrangement");
               ui.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JTextField jCreditLimit;
    private javax.swing.JComboBox<String> jCustID;
    private javax.swing.JTextField jCustName;
    private javax.swing.JTextField jCustType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jOrderId;
    private javax.swing.JButton jbtCheckOrder;
    private javax.swing.JButton jbtOrder;
    private javax.swing.JComboBox<String> jcbAccessories;
    private javax.swing.JComboBox<String> jcbFlower;
    private javax.swing.JComboBox<String> jcbPickUp;
    private javax.swing.JComboBox<String> jcbPriority;
    private javax.swing.JComboBox<String> jcbSize;
    private javax.swing.JComboBox<String> jcbStyle;
    private javax.swing.JLabel jlbAccessories;
    private javax.swing.JLabel jlbFlower;
    private javax.swing.JLabel jlbFlowerShop;
    private javax.swing.JLabel jlbPriority;
    private javax.swing.JLabel jlbSize;
    private javax.swing.JLabel jlbStyle;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlbpickUp;
    // End of variables declaration//GEN-END:variables

}
