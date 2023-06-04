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
import org.junit.Ignore;
 
/**
 *
 * @author xesra
 */
public class CPIT251B10Test {
    
    Employee[] employee = new Employee[4]; 
    public CPIT251B10Test() {
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
     * Test of main method, of class CPIT251B10.
     */
    @Ignore
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CPIT251B10.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ourEmp method, of class CPIT251B10.
     */
    @Ignore
    public void testOurEmp() {
        System.out.println("ourEmp");
        Employee[] employee = null;
       // Employee.ourEmp(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EmpMenu method, of class CPIT251B10.
     */
    @Ignore
    public void testEmpMenu() {
        System.out.println("EmpMenu");
        Employee[] employee = null;
        CPIT251B10.EmpMenu(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plan method, of class CPIT251B10.
     */
    @Ignore
  //  @Test
    public void testPlan() throws Exception {
        System.out.println("plan");
        Employee[] employee = null;
        double c = 0.0;
        CPIT251B10.plan(employee, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testPlanChoice1(){
       employee[0] = new Employee(1, "Ahmed Al-Ghamdi", "Nutrition Specialist", 3.5, 599, " Specialized in Adult Internal Medicine", "Male");
        int choice = 1;
            assertEquals(choice,employee[0].empNum );        
    }
     @Test
    public void testPlanChoice2(){  
         employee[1] = new Employee(2, "Sarah Osama", "Nutrition Specialist", 4.3, 650, " Specialized in Adult Dietitain", "Female");
        int choice = 2;
            assertEquals(choice,employee[1].empNum );  
    }
      @Test
    public void testPlanChoice3(){ 
             employee[2] = new Employee(3, "Hala saad ", "Coach", 5.0, 200, "Specialized in gain weight", "Male");
             int choice = 3;
            assertEquals(choice,employee[2].empNum );
    }
      @Test
    public void testPlanChoice4(){  
              employee[3] = new Employee(4, "Maryam Gamil", "Coach", 4.5, 399, "Specialized in loss weight", "Female");
             int choice = 4;
            assertEquals(choice,employee[3].empNum );
    }
    @Test
    public void testPlanChoiceNotExsist(){  
              employee[3] = new Employee(4, "Maryam Gamil", "Coach", 4.5, 399, "Specialized in loss weight", "Female");
             int choice = 5;
            assertNotEquals(choice,employee[3].empNum );  
    }
    
    
}
