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
 * @author ragha
 */
public class CaloriesTest {
    
    public CaloriesTest() {
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
     * Test of getName method, of class Calories.
     */
    @Ignore
    public void testGetName() {
        System.out.println("getName");
        Calories instance = new Calories("sara", 15,"f", 130, 40, 1, 0);
        String expResult = "sara";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Calories.
     */
    @Ignore
    public void testSetName() {
        System.out.println("setName");
        String Name = "lana";
        Calories instance = new Calories("noura", 23, "f", 159, 67, 1, 0);
        instance.setName(Name);
        assertEquals("lana", instance.getName());
    }

    /**
     * Test of getAge method, of class Calories.
     */
    @Ignore
    public void testGetAge() {
        System.out.println("getAge");
        Calories instance = new Calories("noura", 23, "f", 159, 67, 1, 0);
        int expResult = 23;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Calories.
     */
    @Ignore
    public void testSetAge() {
        System.out.println("setAge");
        int age = 20;
        Calories instance = new Calories("lama", 30, "f", 160, 90, 0, 0);
        instance.setAge(age);
        assertEquals(20, instance.getAge());

    }

    /**
     * Test of getGender method, of class Calories.
     */
    @Ignore
    public void testGetGender() {
        System.out.println("getGender");
        Calories instance = new Calories("hani", 19, "m", 180, 87, 3, 0);
        String expResult = "m";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Calories.
     */
    @Ignore
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "m";
        Calories instance = new Calories("nouf", 22, "f", 167, 58, 2, 0);
        instance.setGender(gender);
        assertEquals(gender, instance.getGender());
    }

    /**
     * Test of getHeight method, of class Calories.
     */
    @Ignore
    public void testGetHeight() {
        System.out.println("getHeight");
        Calories instance = new Calories("rama", 20, "f", 140, 46, 2, 0);
        double expResult = 140.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHeight method, of class Calories.
     */
    @Ignore
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 158.0;
        Calories instance = new Calories("faisal", 34,"m", 174, 70, 0, 0);
        instance.setHeight(height);
        assertEquals(0.0, height, instance.getHeight());
    }

    /**
     * Test of getWeight method, of class Calories.
     */
    @Ignore
    public void testGetWeight() {
        System.out.println("getWeight");
        Calories instance = new Calories("fatimah", 29, "f", 163, 68, 1, 0);
        double expResult = 68.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setWeight method, of class Calories.
     */
    @Ignore
    public void testSetWeight() {
        System.out.println("setWeight");
        double Weight = 68.0;
        Calories instance = new Calories("naif", 35, "m", 189, 98, 2, 0);
        instance.setWeight(Weight);
        assertEquals(0.0, Weight, instance.getWeight());
    }

    /**
     * Test of getActive method, of class Calories.
     */
    @Ignore
    public void testGetActive() {
        System.out.println("getActive");
        Calories instance = new Calories("suha", 24, "f", 150, 55, 2, 0);
        double expResult = 2.0;
        double result = instance.getActive();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setActive method, of class Calories.
     */
    @Ignore
    public void testSetActive() {
        System.out.println("setActive");
        int active = 2;
        Calories instance = new Calories("yara", 21, "f", 165, 63, 3, 0);
        instance.setActive(active);
        assertEquals(0.0, active, instance.getActive());
    }

    /**
     * Test of calCalories method, of class Calories.
     */
    @Test
    public void testCalCalories() {
        System.out.println("calCalories");
        Calories instance = new Calories("raghad", 22, "f", 153, 45, 1, 0);
        double expResult = 1560.97;
        double result = instance.calCalories();
        assertEquals(expResult, result, 0.0);
    }
    
}
