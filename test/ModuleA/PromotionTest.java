/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kokho
 */
public class PromotionTest {
    private Promotion promotion;
    private Date d1;
    private Date d2;
    
    public PromotionTest() {
    }
    
    @Before
    public void setUp() {
        d1 = new Date(2018, 12, 13);
        d2 = new Date(2018, 12, 22);
        promotion = new Promotion(d1, d2, 8.0);
    }

    /**
     * Test of getStart_date method, of class Promotion.
     */
    @Test
    public void testGetStart_date() {
        System.out.println("getStart_date");
        assertEquals(d1, promotion.getStart_date());
    }

    /**
     * Test of getEnd_date method, of class Promotion.
     */
    @Test
    public void testGetEnd_date() {
        System.out.println("getEnd_date");
        assertEquals(d2, promotion.getEnd_date());
    }

    /**
     * Test of getDiscount_price method, of class Promotion.
     */
    @Test
    public void testGetDiscount_price() {
        System.out.println("getDiscount_price");
        assertEquals(8.0, promotion.getDiscount_price(), 0.1);
    }

    /**
     * Test of setStart_date method, of class Promotion.
     */
    @Test
    public void testSetStart_date() {
        System.out.println("setStart_date");
        promotion.setStart_date(new Date(2018, 12, 12));
        assertEquals(new Date(2018, 12, 12), promotion.getStart_date());
    }

    /**
     * Test of setEnd_date method, of class Promotion.
     */
    @Test
    public void testSetEnd_date() {
        System.out.println("setEnd_date");
        promotion.setEnd_date(new Date(2018, 12, 31));
        assertEquals(new Date(2018, 12, 31), promotion.getEnd_date());
    }

    /**
     * Test of setDiscount_price method, of class Promotion.
     */
    @Test
    public void testSetDiscount_price() {
        System.out.println("setDiscount_price");
        promotion.setDiscount_price(5.0);
        assertEquals(5.0, promotion.getDiscount_price(), 0.1);
    }

    /**
     * Test of toString method, of class Promotion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
    }
    
}
