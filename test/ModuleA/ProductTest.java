/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kokho
 */
public class ProductTest {
    private Product p1, p2;
    private Promotion promotion;
    
    public ProductTest() {
    }
    
    @Before
    public void setUp() {
        p1 = new Product("FL001", "Sunflower", "Round Flower", "Fresh Flowers", 12.0, 22, promotion);
        p2 = new Product("FL002", "Orchid", "Flower that blooms", "Fresh Flowers", 8.0, 33, promotion);
    }

    /**
     * Test of getProd_id method, of class Product.
     */
    @Test
    public void testGetProd_id() {
        System.out.println("getProd_id");
        assertEquals("FL001", p1.getProd_id());
        assertEquals("FL002", p2.getProd_id());
    }

    /**
     * Test of getProd_name method, of class Product.
     */
    @Test
    public void testGetProd_name() {
        System.out.println("getProd_name");
        assertEquals("Sunflower", p1.getProd_name());
        assertEquals("Orchid", p2.getProd_name());
    }

    /**
     * Test of getProd_desc method, of class Product.
     */
    @Test
    public void testGetProd_desc() {
        System.out.println("getProd_desc");
        assertEquals("Round Flower", p1.getProd_desc());
        assertEquals("Flower that blooms", p2.getProd_desc());
    }

    /**
     * Test of getProd_type method, of class Product.
     */
    @Test
    public void testGetProd_type() {
        System.out.println("getProd_type");
        assertEquals("Fresh Flowers", p1.getProd_type());
        assertEquals("Fresh Flowers", p2.getProd_type());
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        assertEquals(12.0, p1.getPrice(), 0.1);
        assertEquals(8.0, p2.getPrice(), 0.1);
    }

    /**
     * Test of getQuantity method, of class Product.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        assertEquals(22, p1.getQuantity());
        assertEquals(33, p2.getQuantity());
    }

    /**
     * Test of getPromotion method, of class Product.
     */
    @Test
    public void testGetPromotion() {
        System.out.println("getPromotion");
        assertEquals(promotion, p1.getPromotion());
        assertEquals(promotion, p2.getPromotion());
    }

    /**
     * Test of setProd_id method, of class Product.
     */
    @Test
    public void testSetProd_id() {
        System.out.println("setProd_id");
        p2.setProd_id("FL003");
        assertEquals("FL003", p2.getProd_id());
    }

    /**
     * Test of setProd_name method, of class Product.
     */
    @Test
    public void testSetProd_name() {
        System.out.println("setProd_name");
        p2.setProd_name("Rose");
        assertEquals("Rose", p2.getProd_name());
        
    }

    /**
     * Test of setProd_desc method, of class Product.
     */
    @Test
    public void testSetProd_desc() {
        System.out.println("setProd_desc");
        p2.setProd_desc("Red Flower");
        assertEquals("Red Flower", p2.getProd_desc());
        
    }

    /**
     * Test of setProd_type method, of class Product.
     */
    @Test
    public void testSetProd_type() {
        System.out.println("setProd_type");
        p2.setProd_type("Fresh Flowers");
        assertEquals("Fresh Flowers", p2.getProd_type());
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        p2.setPrice(5.0);
        assertEquals(5.0, p2.getPrice(), 0.1);
        
    }

    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        p2.setQuantity(44);
        assertEquals(44, p2.getQuantity());
        
    }

    /**
     * Test of setPromotion method, of class Product.
     */
    @Test
    public void testSetPromotion() {
        System.out.println("setPromotion");
        p2.setPromotion(promotion);
        assertEquals(promotion, p2.getPromotion());
    }

    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
    }
    
}
