/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251.b10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aPpLe
 */
public class PaymentTest {
    
    public PaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayPayment method, of class Payment.
     */
    @Test (timeout = 90)
    public void testDisplayPayment() {
        System.out.println("displayPayment");
        String EName = "";
        double fees = 0.0;
        Payment instance = new Payment ("Ahmed Al-Ghamdi", 599);
        double expResult =899.0;
        double result = instance.totalPrice;
        assertEquals(expResult, result, 899.0);
        
        
        
        
    }
  }
