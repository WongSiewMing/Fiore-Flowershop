/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import ModuleA.Product;
import ModuleE.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jun_y
 */
public class FunctionB {
    
    public LinkedList<Customer> custList = new LinkedList<>();
    private LinkedList<Product> prodList = new LinkedList<>();
    private LinkedList<Order> orderList = new LinkedList<>();
    private LinkedList<Invoice> invList = new LinkedList<>();
    public Customer cust = new Customer();
    private Product prod = new Product();
    private Order order = new Order();
    private Invoice inv = new Invoice();
    
    
    
    public void loadCust() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("customer.dat"));
            ArrayList<Customer> tmp = new ArrayList<Customer>();
            tmp = (ArrayList)oiStream.readObject();
            for(int i=0; i<tmp.size(); i++){
                cust = tmp.get(i);
                custList.add(cust);
            }
            oiStream.close();
            
        } catch (FileNotFoundException ex) {
            if (JOptionPane.showConfirmDialog(null, "File not found, would you like to create a new file ?", "ERROR", JOptionPane.ERROR_MESSAGE)==0){
                saveCust();
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
     public void saveCust(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("customer.dat"));
            ArrayList tmp = new ArrayList();
            for(int i=0; i<custList.getNumberOfEntries();i++){
                cust = custList.getEntry(i);
                tmp.add(cust);
            }
            ooStream.writeObject(tmp);
            ooStream.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void loadProd() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("product.dat"));
            ArrayList<Product> tmp = new ArrayList<Product>();
            tmp = (ArrayList)oiStream.readObject();
            for(int i=0; i<tmp.size(); i++){
                prod = tmp.get(i);
                prodList.add(prod);
            }
            oiStream.close();
            
        } catch (FileNotFoundException ex) {
            if (JOptionPane.showConfirmDialog(null, "File not found, would you like to create a new file ?", "ERROR", JOptionPane.ERROR_MESSAGE)==0){
                saveCust();
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
     public void saveProd(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("product.dat"));
            ArrayList tmp = new ArrayList();
            for(int i=0; i<prodList.getNumberOfEntries();i++){
                prod = prodList.getEntry(i);
                tmp.add(prod);
            }
            ooStream.writeObject(tmp);
            ooStream.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadOrder() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("order.dat"));
            ArrayList<Order> tmp = new ArrayList<Order>();
            tmp = (ArrayList)oiStream.readObject();
            for(int i=0; i<tmp.size(); i++){
                order = tmp.get(i);
                orderList.add(order);
            }
            oiStream.close();
            
        } catch (FileNotFoundException ex) {
            if (JOptionPane.showConfirmDialog(null, "File not found, would you like to create a new file ?", "ERROR", JOptionPane.ERROR_MESSAGE)==0){
                saveCust();
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
     public void saveOrder(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("order.dat"));
            ArrayList tmp = new ArrayList();
            for(int i=0; i<orderList.getNumberOfEntries();i++){
                order = orderList.getEntry(i);
                tmp.add(order);
            }
            ooStream.writeObject(tmp);
            ooStream.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public void loadInv() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("invoice.dat"));
            ArrayList<Invoice> tmp = new ArrayList<Invoice>();
            tmp = (ArrayList)oiStream.readObject();
            for(int i=0; i<tmp.size(); i++){
                inv = tmp.get(i);
                invList.add(inv);
            }
            oiStream.close();
            
        } catch (FileNotFoundException ex) {
            if (JOptionPane.showConfirmDialog(null, "File not found, would you like to create a new file ?", "ERROR", JOptionPane.ERROR_MESSAGE)==0){
                saveCust();
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
     public void saveInv(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("invoice.dat"));
            ArrayList tmp = new ArrayList();
            for(int i=0; i<invList.getNumberOfEntries();i++){
                inv = invList.getEntry(i);
                tmp.add(inv);
            }
            ooStream.writeObject(tmp);
            ooStream.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Failed to save", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    
    
    
    
}
